package javaIO.实现文件夹复制;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void copyDir(String sourcePath, String newPath) {
        File start = new File(sourcePath);
        File end = new File(newPath);
        String[] filePath = start.list();       //获取该文件夹下的所有文件以及目录的名字
        if (!end.exists()) {
            end.mkdir();
        }
        for (String temp : filePath) {
            //查看其数组中每一个是文件还是文件夹
            System.out.println(temp);
            if (new File(sourcePath + File.separator + temp).isDirectory()) {
                //为文件夹，进行递归
                copyDir(sourcePath + File.separator + temp, newPath + File.separator + temp);
            } else {
                //为文件则进行拷贝
                copyFile(sourcePath + File.separator + temp, newPath + File.separator + temp);
            }
        }
    }

    public static void copyFile(String sourcePath, String newPath) {
        File start = new File(sourcePath);
        File end = new File(newPath);
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(start));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(end))) {
            int len = 0;
            byte[] flush = new byte[1024];
            while ((len = bis.read(flush)) != -1) {
                bos.write(flush, 0, len);
            }
            bos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        String sourcePath = "E:\\java\\mywork\\interview\\src\\main\\resources\\A";
        String newPath = "E:\\java\\mywork\\interview\\src\\main\\resources\\C";
        copyDir(sourcePath, newPath);
    }
}
