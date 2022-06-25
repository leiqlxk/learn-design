package com.lql.creator.factory.simple;

/**
 * Title: CoffeeStore <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 21:37 <br>
 */
public class CoffeeStore {

    public static void main(String[] args) {
        Coffee american = SimpleFactory.createCoffee("american");
        american.addMilk();
        american.addSugar();

        System.out.println(american.getName());
    }
}
