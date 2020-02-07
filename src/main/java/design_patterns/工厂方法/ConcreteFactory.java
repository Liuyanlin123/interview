package design_patterns.工厂方法;

import design_patterns.简单工厂模式.ConcreteProduct1;
import design_patterns.简单工厂模式.Product;

public class ConcreteFactory extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
