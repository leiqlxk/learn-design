package com.lql.behavior.mediator;

/**
 * Title: Calender <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/4 10:56 <br>
 */
public class Calender extends Colleague{

    public void doCalender() {
        System.out.println("doCalender()");
    }

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }
}
