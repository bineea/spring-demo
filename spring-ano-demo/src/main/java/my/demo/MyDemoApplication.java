package my.demo;

import my.demo.config.AppConfig;
import my.demo.dao.mapper.SampleTransferMapper;
import my.demo.manager.CreateHelloworldManager;
import my.demo.manager.HelloworldManager;
import my.demo.manager.TransferManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class MyDemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SampleTransferMapper sampleTransferMapper = (SampleTransferMapper) applicationContext.getBean("sampleTransferMapper");
        System.out.println(sampleTransferMapper.findAll());

        HelloworldManager helloworldManagerByStatic = (HelloworldManager) applicationContext.getBean("helloworldManagerByStatic");
        System.out.println(helloworldManagerByStatic);

        HelloworldManager helloworldManagerByExample = (HelloworldManager) applicationContext.getBean("helloworldManagerByExample");
        System.out.println(helloworldManagerByExample);

        HelloworldManager helloworldManagerImpl = (HelloworldManager) applicationContext.getBean("helloworldManagerImpl");
        System.out.println(helloworldManagerImpl.sayHelloworld());

        CreateHelloworldManager createHelloworldManager = (CreateHelloworldManager) applicationContext.getBean("getCreateHelloworldManager");
        System.out.println(createHelloworldManager.getHelloworldManagerImplInstance());

        TransferManager transferManager = (TransferManager) applicationContext.getBean("transferManagerImpl");
        try {
            transferManager.handleTransfer("6029621011001","6029621011002", new BigDecimal("1"));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
