package com.lql.creator.factory.simpleConfig;

/**
 * Title: CoffeeStore <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 22:12 <br>
 */
public class CoffeeStore {

    public static void main(String[] args) {
        Coffee latte = SimpleConfigFactory.createCoffe("latte");
        System.out.println(latte.getName());
    }
}
