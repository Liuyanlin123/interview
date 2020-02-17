package library.Library;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        outer:
        while (true) {
            System.out.println("1.录入图书信息\n2.读取图书信息\n3.修改图书信息\n4.删除图书信息\n5.结束");
            switch (scanner.nextInt()) {
                case 1:
                    File file = new File("./");
                    String value = Method.textIn();
                    FileUtils.writeFile(value,file);
                    System.out.println("done!!");
                    break;
                case 2:
                    Book book = new Book();
                    System.out.println("施工中");
                    break;
                case 3:
                    System.out.println("施工中");
                    break;
                case 4:
                    System.out.println("施工中");
                    break;
                case 5:
                    System.out.println("结束");
                    break outer;
                default:
                    System.out.println("无效输入");
                    break;
            }
        }
        }
    }

