package design_patterns.Command命令模式;

public class Client {
    public static void main(String[] args) {
        //开店前准备：烤肉厨师，烤肉菜单，服务员
        Barbecuer boy = new Barbecuer();                                    //通过Barbecuer类实例化一个boy对象，即烧烤者
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);            // 多态的体现：实例化烤羊肉串对象1
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);            //通过command类,实例化一个烤羊肉串命令2对象，并将值赋予给对象
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        bakeChickenWingCommand1.setName("chickenwing");
        bakeMuttonCommand1.setName("mutton");
        bakeMuttonCommand2.setName("mutton");//通过command 类，实例化一个烤翅命令1对象

        Waiter girl = new Waiter();                                         //实例化一个服务员
        //开门营业
        girl.addOrder(bakeMuttonCommand1);                                  //设置订单；服务员接收命令
        girl.addOrder(bakeMuttonCommand2);                                  //记录所点菜品
        girl.addOrder(bakeChickenWingCommand1);

        girl.notifyBarbecuer();                                                      //服务员一次性通知烤肉厨师执行
    }
}
