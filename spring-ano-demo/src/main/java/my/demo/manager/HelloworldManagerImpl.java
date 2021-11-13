package my.demo.manager;

public class HelloworldManagerImpl implements HelloworldManager {

    @Override
    public String sayHelloworld() {
        System.out.println("执行方法：my.demo.service.HelloworldServiceImpl.helloworld");
        return "^_^hello world^_^";
    }
}
