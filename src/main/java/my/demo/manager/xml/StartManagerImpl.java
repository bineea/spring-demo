package my.demo.manager.xml;

public class StartManagerImpl implements StartManager{

    private static StartManagerImpl startManagerImpl = new StartManagerImpl();

    public static StartManagerImpl getInstance() {
        return startManagerImpl;
    }

    private HelloworldManager helloworldManager;

    public HelloworldManager getHelloworldManager() {
        return helloworldManager;
    }

    public void setHelloworldManager(HelloworldManager helloworldManager) {
        this.helloworldManager = helloworldManager;
    }
}
