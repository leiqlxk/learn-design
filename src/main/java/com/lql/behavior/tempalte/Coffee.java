package com.lql.behavior.tempalte;

/**
 * Title: Coffee <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/5 17:17 <br>
 */
public class Coffee extends CoffeeBeverage{
    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }

    @Override
    void pourInCup() {
        System.out.println("Coffee.pourInCup");
    }

    @Override
    void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    void boilwater() {
        System.out.println("Coffee.boilwater");
    }
}
