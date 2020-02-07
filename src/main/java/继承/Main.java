package 继承;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

        Dog dog = new Dog();
        dog.setName("111");

        Sheep sheep =new Sheep();
        sheep.setName("222");

        System.out.println("狗"+dog.getName());
        System.out.println("羊"+sheep.getName());

        sheep.setName("456");
        System.out.println("狗"+dog.getName());
        System.out.println("羊"+sheep.getName());
    }
}
