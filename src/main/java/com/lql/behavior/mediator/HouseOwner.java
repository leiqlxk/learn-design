package com.lql.behavior.mediator;

/**
 * Title: HouseOwner <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:37 <br>
 */
public class HouseOwner implements Person {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void concat(String msg) {
        this.mediator.concat(msg, this);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println("房主收到消息: " + msg);
    }
}
