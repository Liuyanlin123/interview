package design_patterns.责任链chain_of_responsibility;

import java.util.logging.Handler;

public class Client {
    public static void main(String[] args) {
        Request request1 = new Request() ;
        request1.setName("request1");
        request1.setRequestType(RequestType.TYPE1);
        Request request2 = new Request() ;
        request2.setName("request2");
        request2.setRequestType(RequestType.TYPE2);
        Request request3 = new Request() ;
        request3.setName("request3");
        request3.setRequestType(RequestType.TYPE3);

        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        handler1.handleRequest(request3);

    }
}
