package my.demo;

import my.demo.config.ApplyConfig;
import my.demo.manager.annotation.EndManagerImpl;
import my.demo.manager.xml.StartManagerImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContentApplication {

    public static void main(String[] args) {

        //XML方式配置Bean
//        ClassPathXmlApplicationContext xmlApplicationContext =
//                new ClassPathXmlApplicationContext("classpath:spring.xml");
//
//        System.out.println(xmlApplicationContext.getBean(StartManagerImpl.class).getHelloworldManager());

        //注解方式配置Bean
        AnnotationConfigApplicationContext annoApplicationContext =
                new AnnotationConfigApplicationContext(ApplyConfig.class);
        System.out.println(annoApplicationContext.getBean(EndManagerImpl.class).getByeworldManager());
    }
}
