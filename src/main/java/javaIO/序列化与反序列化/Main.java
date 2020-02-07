package javaIO.序列化与反序列化;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person();
        person.setId(123);
        person.setName("xiaoming");
        File file = new File("E:\\java\\mywork\\interview\\src\\main\\resources\\A\\B\\hi.txt");
        FileOutputStream fos = new FileOutputStream(file);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        objectOutputStream.writeObject(person);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        person = (Person) objectInputStream.readObject();
        System.out.println(person.getName());

    }
}
