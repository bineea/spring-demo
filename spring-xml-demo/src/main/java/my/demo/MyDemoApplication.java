package my.demo;

import my.demo.dao.mapper.SampleTransferMapper;
import my.demo.manager.HelloworldManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDemoApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        SampleTransferMapper sampleTransferMapper = (SampleTransferMapper) xmlApplicationContext.getBean("sampleTransferMapper");
        System.out.println(sampleTransferMapper.findAll());

        HelloworldManager helloworldManagerByStatic = (HelloworldManager) xmlApplicationContext.getBean("helloworldManagerByStatic");
        System.out.println(helloworldManagerByStatic);

        HelloworldManager helloworldManagerByExample = (HelloworldManager) xmlApplicationContext.getBean("helloworldManagerByExample");
        System.out.println(helloworldManagerByExample);

        HelloworldManager helloworldManagerImpl = (HelloworldManager) xmlApplicationContext.getBean("helloworldServiceImpl");
        System.out.println(helloworldManagerImpl.sayHelloworld());
    }
}
