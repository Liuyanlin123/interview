package design_patterns.Builder;

public class Client {
    //1.相同的方法，不同的执行顺序，产生不同的事件结果时
    //2.多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不相同时
    //3.产品类非常复杂，或者产品类中的调用顺序不同产生了不同的作用，这个时候使用建造者模式非常合适
    //4.当初始化一个对象特别复杂，如参数多，且很多参数都具备默认值时
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("thinkpad", 8)
                .display("hello")
                .board("didi")
                .build();
    }
}
