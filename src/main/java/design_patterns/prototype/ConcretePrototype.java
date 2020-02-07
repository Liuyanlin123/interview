package design_patterns.prototype;

public class ConcretePrototype extends Prototype{
    private String filed;

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    Prototype myclone() {
        return new ConcretePrototype(filed);
    }
}
