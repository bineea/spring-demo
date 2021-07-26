package my.demo;

import my.demo.dao.mapper.SampleTransferMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDemoApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        SampleTransferMapper sampleTransferMapper = (SampleTransferMapper) xmlApplicationContext.getBean("sampleTransferMapper");
        System.out.println(sampleTransferMapper.findAll());
    }
}
