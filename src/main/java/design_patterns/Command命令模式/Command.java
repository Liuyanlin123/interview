package design_patterns.Command命令模式;

public abstract class Command {
    private String name;
    protected Barbecuer barbecuer;//引用烧烤者，因为命令是给烧烤者的

    public Command(Barbecuer barbecuer) {
        this.barbecuer =barbecuer;                                          //命令构造函数，所传参数为烧烤者
    }

    public abstract void ExcuteCommand();//创建一个抽象执行命令方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Barbecuer getReceiver() {
        return barbecuer;
    }

    public void setReceiver(Barbecuer receiver) {
        this.barbecuer = receiver;
    }
}