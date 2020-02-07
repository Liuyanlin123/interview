package java_Collections.集合源码分析.ArrayList.数组转list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        //正确转换方式

        // public <T> T[] toArray(T[] a) {
        //        if (a.length < size)
        //            // Make a new array of a's runtime type, but my contents:
        //            return (T[]) Arrays.copyOf(elementData, size, a.getClass());
        //        System.arraycopy(elementData, 0, a, 0, size);
        //        if (a.length > size)
        //            a[size] = null;
        //        return a;
        //    }
        Integer[] a= new Integer[list.size()];
        list.toArray(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
