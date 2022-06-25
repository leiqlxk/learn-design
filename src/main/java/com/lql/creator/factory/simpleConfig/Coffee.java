package com.lql.creator.factory.simpleConfig;

/**
 * Title: Coffe <br>
 * ProjectName: learn-design <br>
 * description: 咖啡基类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 21:29 <br>
 */
public abstract class Coffee {

    public abstract String getName();

    public void addMilk() {
        System.out.println("加奶");
    }

    public void addSugar() {
        System.out.println("加糖");
    }
}
