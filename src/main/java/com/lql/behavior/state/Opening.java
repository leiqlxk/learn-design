package com.lql.behavior.state;

/**
 * Title: Opening <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:53 <br>
 */
public class Opening extends Lift {

    @Override
    public void open() {
        System.out.println("电梯门开了");
    }

    @Override
    public void close() {
        this.context.setCurrentState(Context.CLOSING_SATE);
        this.context.getCurrentState().close();
    }
}
