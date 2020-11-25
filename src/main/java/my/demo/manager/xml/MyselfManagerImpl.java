package my.demo.manager.xml;

public class MyselfManagerImpl {

    public MyselfManagerImpl() {
        System.out.println("MyselfManagerImpl init");
    }

    private String name;
    private String value;

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void toShow() {
        System.out.println(this+"-myself——name："+name+"；value："+value);
    }


}
