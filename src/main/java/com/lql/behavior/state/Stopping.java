package com.lql.behavior.state;

/**
 * Title: Stopping <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:55 <br>
 */
public class Stopping extends Lift{

    @Override
    public void open() {
        this.context.setCurrentState(Context.OPENING_SATE);
        this.context.getCurrentState().open();
    }

    @Override
    public void close() {
        this.context.setCurrentState(Context.CLOSING_SATE);
        this.context.getCurrentState().close();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止运行");
    }

    @Override
    public void run() {
        this.context.setCurrentState(Context.running_SATE);
        this.context.getCurrentState().run();
    }
}
