package java并发.线程工厂;

import java.util.concurrent.ThreadFactory;

public class UserThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        return null;
    }
}
