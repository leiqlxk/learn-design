package com.lql.creator.factory.method;

/**
 * Title: CoffeeFactory <br>
 * ProjectName: learn-design <br>
 * description: 工厂接口：工厂方法模式可以很好的解决普通工厂模式带来的问题，完全符合开闭原则，但随着产品的增加工厂实现类会随之暴增 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 21:40 <br>
 */
public interface CoffeeFactory {

    Coffee createCoffee();
}
