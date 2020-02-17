package library.Library;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Book {
    public Book() {
    }

    private String No;
    private String Name;
    private String Cost;
    private boolean isUse;

    public void setNo(String no) {
        No = no;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCost(String cost) {
        Cost = cost;
    }

    public void setUse(boolean use) {
        isUse = use;
    }

    public String getNo() {
        return No;
    }

    public String getName() {
        return Name;
    }

    public String getCost() {
        return Cost;
    }

    public boolean isUse() {
        return isUse;
    }


    public void FileUse() throws IOException {
        File file = new File("D:\\text02.txt");
        FileWriter fileWriter = new FileWriter(file);
        Scanner scanner = new Scanner(System.in);
        String a;
        String b;
        String c;
        String d;
        a = getNo();
        b = getName();
        d = getCost();
        c = a + "  " + b + "  " + d;
        fileWriter.write(c);
        fileWriter.close();
    }
}