package com.lql.behavior.state;

/**
 * Title: Closing <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:54 <br>
 */
public class Closing extends Lift{

    @Override
    public void open() {
        this.context.setCurrentState(Context.OPENING_SATE);
        this.context.getCurrentState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门已经关闭");
    }

    @Override
    public void stop() {
        this.context.setCurrentState(Context.STOPPING_SATE);
        this.context.getCurrentState().stop();
    }

    @Override
    public void run() {
        this.context.setCurrentState(Context.running_SATE);
        this.context.getCurrentState().run();
    }
}
