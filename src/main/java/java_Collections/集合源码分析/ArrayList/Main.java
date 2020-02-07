package java_Collections.集合源码分析.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description:
 * @author: Ezreal
 * @date: 2020-02-01
 */
public class Main {

    public static void main(String[] args) {
        //fail-fast 遍历或序列化的时候 如果增加或者删除节点就会 报错
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        //1.抛出ConcurrentModificationException
       Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            if (integer.intValue()==0){
                list.remove(0);
            }
        }

    }
}
