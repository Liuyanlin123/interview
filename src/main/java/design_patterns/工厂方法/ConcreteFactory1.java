package design_patterns.工厂方法;

import design_patterns.简单工厂模式.ConcreteProduct2;
import design_patterns.简单工厂模式.Product;

public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
