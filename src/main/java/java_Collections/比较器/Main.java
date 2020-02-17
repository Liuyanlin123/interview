package java_Collections.比较器;

import javaIO.序列化与反序列化.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            person.setId(i);
            personList.add(person);
        }

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId()>o2.getId()){
                    return -1;
                }else if (o1.getId()<o2.getId()){
                    return 1;
                }else {
                    return 0;
                }
            }
        });


    }
}
