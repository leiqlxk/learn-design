package com.lql.creator.factory.abstr;

/**
 * Title: DessertFactory <br>
 * ProjectName: learn-design <br>
 * description: 抽象工厂模式：此模式关注的为不同等级的一组产品组成的产品族，类似于固定搭配的一组产品，即可以保证客户端只使用一个产品族内的产品，但是新增一类产品时所有工厂实现类都需要进行修改 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 21:48 <br>
 */
public interface DessertFactory {

    Coffee createCoffee();

    Dessert createDessert();
}
