package com.lql.creator.factory.method;

/**
 * Title: CoffeeStore <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 21:44 <br>
 */
public class CoffeeStore {

    public static void main(String[] args) {
        CoffeeFactory factory = new AmericanCoffeeFactory();
        Coffee coffee = factory.createCoffee();

        coffee.addMilk();
        coffee.addSugar();

        System.out.println(coffee.getName());
    }
}
