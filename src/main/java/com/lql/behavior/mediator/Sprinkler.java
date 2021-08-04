package com.lql.behavior.mediator;

/**
 * Title: Sprinkler <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/4 10:57 <br>
 */
public class Sprinkler extends Colleague{

    public void doSprinkler() {
        System.out.println("doSprinkler()");
    }

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }
}
