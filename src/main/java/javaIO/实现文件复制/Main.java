package javaIO.实现文件复制;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("E:\\java\\mywork\\interview\\src\\main\\resources\\A");
        FileOutputStream fos = new FileOutputStream("E:\\java\\mywork\\interview\\src\\main\\resources\\C");
        byte[] buffer = new byte[20 * 1024];
        int cnt;
        while ((cnt = fis.read(buffer, 0, buffer.length)) != -1) {
            fos.write(buffer, 0, cnt);
        }
        fis.close();
        fos.close();
    }


}
