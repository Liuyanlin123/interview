package hello;

import javaIO.NIO.实现文件快速复制.Main;
import org.junit.Test;

import java.io.IOException;

public class HelloTest {
    @Test
    public void helloTest() throws IOException {
        Main.fastCopy("E:\\java\\mywork\\interview\\src\\main\\resources\\C\\B\\hi.txt",
                "E:\\java\\mywork\\interview\\src\\main\\resources\\C\\hello.txt");

    }
}
