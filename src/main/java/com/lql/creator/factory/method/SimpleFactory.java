package com.lql.creator.factory.method;

/**
 * Title: SimpleFactory <br>
 * ProjectName: learn-design <br>
 * description: 简单工厂，使客户端与具体产品解耦，但工厂类与具体产品会产生耦合，并且违反了开闭原则 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 21:29 <br>
 */
public class SimpleFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".endsWith(type)) {
            coffee = new AmericanCoffee();
        }else if ("latte".endsWith(type)) {
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("没有匹配的咖啡");
        }

        return coffee;
    }
}
