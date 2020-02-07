package design_patterns.责任链chain_of_responsibility;

public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;

    protected abstract void handle(Request request);

    protected abstract RequestType getRequestType();

    protected void handleRequest(Request request) {
        if (getRequestType() == request.getRequestType()) {
            handle(request);
        } else {
            if (nextHandler!=null){
                nextHandler.handleRequest(request);
            }else {
                System.out.println("这些都处理不了 嘿嘿!!，你有办法吗？ 你没有办法");
            }
        }
    }

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
