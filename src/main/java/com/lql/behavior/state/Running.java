package com.lql.behavior.state;

/**
 * Title: Running <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:55 <br>
 */
public class Running extends Lift {

    @Override
    public void stop() {
        this.context.setCurrentState(Context.STOPPING_SATE);
        this.context.getCurrentState().stop();
    }

    @Override
    public void run() {
        System.out.println("电梯正在运行");
    }
}
