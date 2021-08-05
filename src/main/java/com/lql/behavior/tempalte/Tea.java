package com.lql.behavior.tempalte;

/**
 * Title: Tea <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/5 17:19 <br>
 */
public class Tea extends CoffeeBeverage{
    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }

    @Override
    void pourInCup() {
        System.out.println("Tea.pourInCup");
    }

    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void boilwater() {
        System.out.println("Tea.boilwater");
    }
}
