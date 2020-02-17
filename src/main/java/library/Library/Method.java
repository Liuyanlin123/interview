package library.Library;

import java.io.IOException;
import java.util.Scanner;

public class Method {
    public Method() {

    }

    /*
    1.输入
    2.写文件
     */
    /**
     * 只管输入
     * @throws IOException
     */
    public static String textIn() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        int price;
        System.out.println("输入图书编号");
        id = scanner.nextInt();
        System.out.println("输入图书名称");
        name = scanner.nextLine();
        System.out.println("输入图书价格");
        price = scanner.nextInt();
        return id+" "+name+" "+price;
    }
}
