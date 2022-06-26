package com.lql.structure.decorate;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 21:22 <br>
 */
public class Client {

    public static void main(String[] args) {
        FastFood fridRice = new FridRice();
        Decorate egg = new Egg(fridRice);
        System.out.println(egg.getDesc());
        System.out.println(egg.cost());

        System.out.println("===================");
        Decorate bacon = new Bacon(egg);
        System.out.println(bacon.getDesc());
        System.out.println(bacon.cost());

    }
}
