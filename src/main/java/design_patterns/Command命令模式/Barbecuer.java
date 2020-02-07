package design_patterns.Command命令模式;

import java.io.Console;

public class Barbecuer {
    public void BakeMutton()   {                                           //创建烤羊肉的方法{
        System.out.println("烤羊肉串");
    }
    public void BakeChickenWing()      {                                   //实现烤鸡翅的方法{
        System.out.println("烤鸡翅！");
    }

}
