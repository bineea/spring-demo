package my.demo.manager.annotation;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TestDependencyInjection {

    //@Autowired注解自动将实现FactoryBean接口的Spring Bean注入到map中
    @Autowired
    private Map<String, FactoryBean> testDIMap = new ConcurrentHashMap<>();

    public void getFactoryBeanImpl() {
        for(String key : testDIMap.keySet()) {
            System.out.println("spring中beanName："+key+"；实例对象："+testDIMap.get(key));
        }
    }
}
