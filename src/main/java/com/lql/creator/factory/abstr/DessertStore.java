package com.lql.creator.factory.abstr;

/**
 * Title: DessertStore <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 21:54 <br>
 */
public class DessertStore {

    public static void main(String[] args) {
        DessertFactory factory = new AmericanDessertFactory();

        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
