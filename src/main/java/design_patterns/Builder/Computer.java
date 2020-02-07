package design_patterns.Builder;

public class Computer {
    private String mModel;      //型号    （必传参数）
    private int mMemory;        //内存    （必传参数）
    private int mGraphics;      //显卡    （不必传参数）
    private String mBoard;      //主机    （不必传参数）
    private String mDisplay;    //显示器  （不必传参数）
    private String mProcessor;  //处理器  （不必传参数）

    private Computer(ComputerBuilder builder) {
        this.mModel = builder.mModel;
        this.mMemory = builder.mMemory;
        this.mGraphics = builder.mGraphics;
        this.mBoard = builder.mBoard;
        this.mDisplay = builder.mDisplay;
        this.mProcessor = builder.mProcessor;
    }

    public String getmModel() {
        return mModel;
    }

    public int getmMemory() {
        return mMemory;
    }

    public int getmGraphics() {
        return mGraphics;
    }

    public String getmBoard() {
        return mBoard;
    }

    public String getmDisplay() {
        return mDisplay;
    }

    public String getmProcessor() {
        return mProcessor;
    }

    public static class ComputerBuilder {
        private final String mModel;      //型号
        private final int mMemory;        //内存
        private int mGraphics;            //显卡
        private String mBoard;            //主机
        private String mDisplay;          //显示器
        private String mProcessor;        //处理器

        public ComputerBuilder(String mModel, int mMemory) {
            this.mModel = mModel;
            this.mMemory = mMemory;
        }

        public ComputerBuilder graphics(int graphics) {
            this.mGraphics = graphics;
            return this;
        }

        public ComputerBuilder board(String board) {
            this.mBoard = board;
            return this;
        }

        public ComputerBuilder display(String display) {
            this.mDisplay = display;
            return this;
        }

        public ComputerBuilder processor(String processor) {
            this.mProcessor = processor;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
