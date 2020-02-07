package java_Collections.容器中的设计模式;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//1.迭代器模式
//2.适配器模式
public class Main {
    public static void main(String[] args) {
        //1.迭代器模式
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        //2.适配器模式
        Integer[] a = {1, 2, 3};
        //数组转list应该这么用
        List<Integer> alist = new ArrayList<Integer>(Arrays.asList(a))  ;
        /*  public static <T> List<T> asList(T... a) {
                return new ArrayList<>(a);
            }
                 此ArrayList 非彼ArrayList  这个是Arrays 里面的一个内部类 只有部分实现
                会抛出异常
                Exception in thread "main" java.lang.UnsupportedOperationException
	            at java.base/java.util.AbstractList.add(AbstractList.java:153)
	            at java.base/java.util.AbstractList.add(AbstractList.java:111)
	            at java_Collections.容器中的设计模式.Client.main(Client.java:22)
        */
        alist.add(3);
        alist.remove(0);
        System.out.println(alist);
        alist.clear();
        System.out.println(alist);
    }
}
