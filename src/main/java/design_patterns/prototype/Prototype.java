package design_patterns.prototype;

//使用场景：需要创建与某个实例对象具有相同状态（成员变量值相同）的对象。
public abstract class Prototype {
    abstract Prototype myclone();
}
