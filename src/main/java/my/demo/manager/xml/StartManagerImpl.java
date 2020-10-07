package my.demo.manager.xml;

public class StartManagerImpl implements StartManager{

    private HelloworldManager helloworldManager;

    public HelloworldManager getHelloworldManager() {
        return helloworldManager;
    }

    public void setHelloworldManager(HelloworldManager helloworldManager) {
        this.helloworldManager = helloworldManager;
    }
}
