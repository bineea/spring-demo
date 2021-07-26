package my.demo.manager.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RepeatManagerImpl implements RepeatManager {

    private static int repeatCount = 0;
    private int singleInstanceCount = 0;

    public RepeatManagerImpl() {
        repeatCount++;
        System.out.println(this+"无参构造方式实例化RepeatManagerImpl，当前repeatCount："+repeatCount);
    }

    @Override
    public void doAgain() {
        singleInstanceCount++;
        System.out.println(this+"doAgain："+singleInstanceCount);
    }
}
