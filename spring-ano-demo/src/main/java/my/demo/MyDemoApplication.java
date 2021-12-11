package my.demo;

import my.demo.config.AppConfig;
import my.demo.dao.mapper.SampleTransferMapper;
import my.demo.manager.CreateHelloworldManager;
import my.demo.manager.HelloworldManager;
import my.demo.manager.HelloworldManagerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        SampleTransferMapper sampleTransferMapper = (SampleTransferMapper) applicationContext.getBean("sampleTransferMapper");
//        System.out.println(sampleTransferMapper.findAll());
//
//        HelloworldManager helloworldManagerByStatic = (HelloworldManager) applicationContext.getBean("helloworldManagerByStatic");
//        System.out.println(helloworldManagerByStatic);
//
//        HelloworldManager helloworldManagerByExample = (HelloworldManager) applicationContext.getBean("helloworldManagerByExample");
//        System.out.println(helloworldManagerByExample);

//        HelloworldManager helloworldManagerImpl = (HelloworldManager) applicationContext.getBean("helloworldManagerImpl");
//        System.out.println(helloworldManagerImpl.sayHelloworld());

        CreateHelloworldManager createHelloworldManager = (CreateHelloworldManager) applicationContext.getBean("getCreateHelloworldManager");
        System.out.println(createHelloworldManager.getHelloworldManagerImplInstance());
    }
}
