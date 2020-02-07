package design_patterns.工厂方法;

import design_patterns.简单工厂模式.Product;

public abstract class Factory {
    public abstract Product factoryMethod();
    public void dosomething(){
        Product product = factoryMethod();
    }
}
