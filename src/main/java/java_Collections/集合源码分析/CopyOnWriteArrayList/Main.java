package java_Collections.集合源码分析.CopyOnWriteArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    private static Person person = new Person();

    static {
        List<Integer> roles = new ArrayList<>(10000);
        for (int i = 0; i < 10000; i++) {
            roles.add(i);
        }
        person.setRoles(roles);
    }

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> roles = new CopyOnWriteArrayList<>(person.getRoles());
        new Thread(() -> {
            roles.add(500);
        }).start();
        new Thread(() -> {
            roles.add(500);
        }).start();
        new Thread(() -> {
            roles.add(500);
        }).start();
        new Thread(() -> {
            for (Integer role : roles) {
                System.out.println(role);
            }
        }).start();
    }
}
