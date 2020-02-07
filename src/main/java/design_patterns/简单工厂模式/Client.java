package design_patterns.简单工厂模式;

public class Client {

    public static void main(String[] args) {
        //如果客户类中出现 Product product = new Product(); 这种代码就是不合理的
        Product product = new SimpleFactory().createProduct(0);
    }
}
