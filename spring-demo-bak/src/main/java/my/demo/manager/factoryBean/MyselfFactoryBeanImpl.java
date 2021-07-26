package my.demo.manager.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyselfFactoryBeanImpl implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        System.out.println("实现FactoryBean接口，执行自定义创建Spring Bean的逻辑");
        return new TestBean();
    }

    @Override
    public Class<?> getObjectType() {
        return TestBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
