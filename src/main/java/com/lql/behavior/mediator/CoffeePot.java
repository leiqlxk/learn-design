package com.lql.behavior.mediator;

/**
 * Title: CoffePot <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/4 10:54 <br>
 */
public class CoffeePot extends Colleague{

    public void doCoffeePot() {
        System.out.println("doCoffeePot()");
    }

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }
}
