package design_patterns.Command命令模式;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void addOrder(Command command) {
        if ("chickenwing".equals(command.getName())) {
            System.out.println("鸡翅没有了，没法做了，亲!!");
        } else if ("mutton".equals(command.getName())) {
            orders.add(command);
            System.out.println("女仆加了个订单");
        } else {
            System.out.println("这个真没有");
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("女仆删除了个订单"+command.getName());
    }

    public void notifyBarbecuer(){
        for (Command order : orders) {
            order.ExcuteCommand();
        }
    }
}
