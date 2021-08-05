package com.lql.behavior.strategy;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/5 17:10 <br>
 */
public class Client {

    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.setQuackBehavior(new Quack());
        duck.performQuack();

        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
    }
}
