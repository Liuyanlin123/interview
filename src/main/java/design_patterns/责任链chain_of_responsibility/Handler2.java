package design_patterns.责任链chain_of_responsibility;

public class Handler2 extends AbstractHandler {
    @Override
    protected void handle(Request request) {
        System.out.println(request.getName()+ "  handle2 处理了");
    }

    @Override
    protected RequestType getRequestType() {
        return RequestType.TYPE2;
    }
}
