package com.lql.behavior.mediator;

/**
 * Title: Alarm <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/4 10:52 <br>
 */
public class Alarm extends Colleague{

    public void doAlarm() {
        System.out.println("doAlarm()");
    }

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }
}
