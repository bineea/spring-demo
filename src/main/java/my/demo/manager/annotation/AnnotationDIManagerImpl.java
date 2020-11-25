package my.demo.manager.annotation;

import my.demo.manager.util.ApplicationContextUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDIManagerImpl implements AnnotationDIManager {

    public void repeatSomeThing() {
        RepeatManager repeatManager = this.lookup2Instance();
        repeatManager.doAgain();
    }

    @Lookup
    public RepeatManager lookup2Instance() {
        return null;
    }

    @Autowired
    private ByeworldManager byeworldManagerImpl;

    public AnnotationDIManagerImpl() {
        System.out.println("AnnotationDIManagerImpl执行无参构造方法");
    }

    public AnnotationDIManagerImpl(ByeworldManager byeworldManager) {
        this.byeworldManagerImpl = byeworldManager;
        System.out.println("AnnotationDIManagerImpl执行有参构造方法，参数为ByeworldManager");
    }

    public void setByeworldManager(ByeworldManager byeworldManager) {
        this.byeworldManagerImpl = null;
        System.out.println("AnnotationDIManagerImpl执行setByeworldManager方法，参数为ByeworldManager");
    }

    public void setByeworldManagerImpl(ByeworldManager byeworldManager) {
        this.byeworldManagerImpl = byeworldManager;
        System.out.println("AnnotationDIManagerImpl执行setByeworldManagerImpl方法，参数为ByeworldManager");
    }

    public ByeworldManager getByeworldManager() {
        return byeworldManagerImpl;
    }

}
