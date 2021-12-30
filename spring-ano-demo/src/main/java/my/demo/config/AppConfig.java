package my.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import my.demo.manager.CreateHelloworldManager;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@ComponentScan({"my.demo"})
//开启AOP切面
@EnableAspectJAutoProxy
//开启事务
@EnableTransactionManagement
//配置Mybatis的dao层路径
@MapperScan(basePackages = {"my.demo.dao"}, annotationClass = Mapper.class)
//读取配置文件
@PropertySource({"classpath:database.properties"})
public class AppConfig {

    @Bean
    public CreateHelloworldManager getCreateHelloworldManager(AppConfig appConfig) {
        System.out.println(appConfig.toString());
        return new CreateHelloworldManager();
    }

    @Value("${database.drive}")
    private String driverClassName;
    @Value("${database.url}")
    private String jdbcUrl;
    @Value("${database.username}")
    private String username;
    @Value("${database.password}")
    private String password;

    @Value("${validationQuery}")
    private String validationQuery;

    @Bean(name = "dataSource")
    public DataSource initDataSource()
    {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        //初始化连接数
        dataSource.setInitialSize(5);
        //最小空闲连接数
        dataSource.setMinIdle(1);
        //最大活动连接数
        dataSource.setMaxActive(100);
        //最大连接等待时间
        dataSource.setMaxWait(60000);
        //SQL查询,用来验证从连接池取出的连接,在将连接返回给调用者之前.如果指定,则查询必须是一个SQL SELECT并且必须返回至少一行记录
        dataSource.setValidationQuery(validationQuery);
        //是否在从连接池中取出连接前进行检验,如果检验失败,则从连接池中去除连接并尝试取出另一个；若设置为true，validationQuery参数必须设置为非空字符串
        dataSource.setTestOnBorrow(false);
        //是否在归还到池中前进行检验；若设置为true，validationQuery参数必须设置为非空字符串
        dataSource.setTestOnReturn(false);
        //连接是否被空闲连接回收器(如果有)进行检验.如果检测失败,则连接将被从池中去除；若设置为true，validationQuery参数必须设置为非空字符串
        dataSource.setTestWhileIdle(true);
        // 打开PSCache，并且指定每个连接上PSCache的大小
        dataSource.setPoolPreparedStatements(true);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);

        return dataSource;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        //配置xml文件路径
        sqlSessionFactory.setMapperLocations(
                new PathMatchingResourcePatternResolver()
                        .getResources("classpath:mapper/*.xml"));
        return sqlSessionFactory;
    }
}
