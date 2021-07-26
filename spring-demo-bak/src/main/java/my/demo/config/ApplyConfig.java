package my.demo.config;

import my.demo.manager.importBean.Test2ImportBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Test2ImportBean.class)
@ComponentScan(basePackages = {"my.demo"})
public class ApplyConfig {

//    @Bean(name="annotationDIManagerImpl")
//    public AnnotationDIManagerImpl newAnnotationDIManagerImpl2Bean() {
//        return new AnnotationDIManagerImpl();
//    }
//
//    @Bean(name="annotationDIManagerImpl", autowire = Autowire.BY_TYPE)
//    public AnnotationDIManagerImpl newAnnotationDIManagerImpl2Bean() {
//        return new AnnotationDIManagerImpl();
//    }
//
//    @Bean(name="annotationDIManagerImpl", autowire = Autowire.BY_NAME)
//    public AnnotationDIManagerImpl newAnnotationDIManagerImpl2Bean() {
//        return new AnnotationDIManagerImpl();
//    }

//    @Autowired
//    private ByeworldManager byeworldManager;
//
//    @Bean(name="annotationDIManagerImpl")
//    public AnnotationDIManagerImpl newAnnotationDIManagerImpl2Bean(ByeworldManager byeworldManager) {
//        return new AnnotationDIManagerImpl(byeworldManager);
//    }
}