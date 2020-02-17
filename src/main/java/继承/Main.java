package 继承;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal1 = new Dog();
        animal.setName("111");
        animal1.setName("111");
        System.out.println(animal.getName().hashCode());
        System.out.println(Objects.hash(animal.getName()));
        System.out.println(animal.equals(animal1));
    }
}
