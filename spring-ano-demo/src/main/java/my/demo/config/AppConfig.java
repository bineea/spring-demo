package my.demo.config;

import my.demo.manager.CreateHelloworldManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"my.demo"})
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class AppConfig {

    @Bean
    public CreateHelloworldManager getCreateHelloworldManager(AppConfig appConfig) {
        System.out.println(appConfig.toString());
        return new CreateHelloworldManager();
    }
}
