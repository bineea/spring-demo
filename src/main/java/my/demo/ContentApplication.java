package my.demo;

import my.demo.config.ApplyConfig;
import my.demo.manager.annotation.AnnotationDIManagerImpl;
import my.demo.manager.annotation.EndManager;
import my.demo.manager.annotation.EndManagerImpl;
import my.demo.manager.annotation.TestDependencyInjection;
import my.demo.manager.factoryBean.TestBean;
import my.demo.manager.importBean.Test2ImportBean;
import my.demo.manager.test.Test2RegisterBean;
import my.demo.manager.xml.MyselfManagerImpl;
import my.demo.manager.xml.StartManagerImpl;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContentApplication {

    public static void main(String[] args) {
        //XML方式配置Bean
//        ClassPathXmlApplicationContext xmlApplicationContext =
//                new ClassPathXmlApplicationContext("classpath:spring.xml");
//        xmlApplicationContext.getBean(MyselfManagerImpl.class).toShow();
//        xmlApplicationContext.getBean(MyselfManagerImpl.class).toShow();
//        xmlApplicationContext.getBean(MyselfManagerImpl.class).toShow();

        //注解方式配置Bean
        AnnotationConfigApplicationContext annoApplicationContext =
                new AnnotationConfigApplicationContext(ApplyConfig.class);

        //获取单例bean
        annoApplicationContext.getBean(TestDependencyInjection.class).getFactoryBeanImpl();

        //创建BeanDefinition，并配置属性
//        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//        beanDefinition.setBeanClass(Test2RegisterBean.class);
//        beanDefinition.setScope(ConfigurableBeanFactory.SCOPE_SINGLETON);
//        annoApplicationContext.registerBeanDefinition("test2RegisterBean", beanDefinition);
//        System.out.println("执行getBean（“test2RegisterBean”）："+annoApplicationContext.getBean("test2RegisterBean"));

//        单例Bean注入原型Bean
//        AnnotationDIManagerImpl annotationDIManager = annoApplicationContext.getBean(AnnotationDIManagerImpl.class);
//        annotationDIManager.repeatSomeThing();
//        annotationDIManager.repeatSomeThing();
//        annotationDIManager.repeatSomeThing();
//        System.out.println(annoApplicationContext.getBean(AnnotationDIManagerImpl.class).getByeworldManager());

//        自定义FactoryBean
//        System.out.println("执行getBean（“myselfFactoryBeanImpl”）："+annoApplicationContext.getBean("myselfFactoryBeanImpl"));
//        System.out.println("执行getBean（“&myselfFactoryBeanImpl”）："+annoApplicationContext.getBean("&myselfFactoryBeanImpl"));

//        @Import导入Bean
//        System.out.println("执行getBean（Test2ImportBean.class）："+annoApplicationContext.getBean(Test2ImportBean.class));

        // 定义了一个BeanDefinition
//        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        // 当前Bean对象的类型
//        beanDefinition.setBeanClass(Test2RegisterBean.class);
//        beanDefinition.setScope(ConfigurableBeanFactory.SCOPE_SINGLETON);
        // 将BeanDefinition注册到BeanFactory中
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        beanFactory.registerBeanDefinition("test2RegisterBean", beanDefinition);
        // 获取Bean
//        System.out.println("执行getBean（“test2RegisterBean”）："+beanFactory.getBean("test2RegisterBean"));


//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(beanFactory);

        // 将Test2RegisterBean.class解析为BeanDefinition
//        annotatedBeanDefinitionReader.register(Test2RegisterBean.class);
        // 获取Bean
//        System.out.println("执行getBean（“test2RegisterBean”）："+beanFactory.getBean("test2RegisterBean"));


//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //配置扫描路径
//        ClassPathBeanDefinitionScanner classPathBeanDefinitionScanner = new ClassPathBeanDefinitionScanner(beanFactory);
//        classPathBeanDefinitionScanner.scan("my.demo");
        // 获取Bean
//        System.out.println("执行getBean（“byeworldManagerImpl”）："+beanFactory.getBean("byeworldManagerImpl"));

    }
}








//XML方式配置Bean
//ClassPathXmlApplicationContext xmlApplicationContext =
//        new ClassPathXmlApplicationContext("classpath:spring.xml");
//xmlApplicationContext.getBeanFactory().registerSingleton("", new Object());
//xmlApplicationContext.start();
//System.out.println(xmlApplicationContext.getBean(StartManagerImpl.class).getHelloworldManager());

//注解方式配置Bean
//AnnotationConfigApplicationContext annoApplicationContext =
//        new AnnotationConfigApplicationContext(ApplyConfig.class);
//annoApplicationContext.registerBean("", Object.class, null);
//annoApplicationContext.refresh();
//System.out.println(annoApplicationContext.getBean(EndManagerImpl.class).getByeworldManager());
