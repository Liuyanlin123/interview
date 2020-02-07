package design_patterns.简单工厂模式;

public class SimpleFactory {

    public Product createProduct(int type){
        if (type==0){
            return new ConcreteProduct1();
        }else if (type==1){
            return new ConcreteProduct2();
        }else {
            return null;
        }
    }
}
