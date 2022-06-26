package com.lql.creator.builder.demo2;


/**
 * Title: Phone <br>
 * ProjectName: learn-design <br>
 * description: 建造者模式扩展，将建造者以内部类的形式定义且完成构建过程的链式调用，简化操作，客户端可以根据自己的需要调整装配顺序，但增加了代码的复杂度 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 18:11 <br>
 */
public class Phone {

    private String cpu;
    private String memory;
    private String mainBoard;
    private String screen;

    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
        this.screen = builder.screen;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    public static final class Builder{
        private String cpu;
        private String memory;
        private String mainBoard;
        private String screen;

        public Builder builderCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder builderMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder builderBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Builder builderScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }

}
