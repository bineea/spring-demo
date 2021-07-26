package my.demo.manager.annotation;

import org.springframework.beans.factory.annotation.Autowired;


public class EndManagerImpl implements EndManager {

    @Autowired
    private ByeworldManager byeworldManager;

    public ByeworldManager getByeworldManager() {
        return byeworldManager;
    }

    public void setByeworldManager(ByeworldManager byeworldManager) {
        this.byeworldManager = byeworldManager;
    }
}
