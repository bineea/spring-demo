package my.demo.manager.xml;

public class DefaultStartManagerLocator {

    private static StartManagerImpl startManagerImpl = new StartManagerImpl();

    public StartManagerImpl getStartManagerImplInstance() {
        return startManagerImpl;
    }
}
