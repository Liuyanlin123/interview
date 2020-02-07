package 异常处理;

import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) {
        String s = "中文";
        try {
            byte[] b= s.getBytes("utf-8");
            System.out.println(b);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
