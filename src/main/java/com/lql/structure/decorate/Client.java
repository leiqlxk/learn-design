package com.lql.structure.decorate;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/11 10:43 <br>
 */
public class Client {

    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();

        Beverage milk = new Milk(houseBlend);
        Beverage mocha = new Mocha(milk);

        System.out.println(mocha.cost());
    }
}
