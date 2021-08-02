package com.lql.creator.abfactory;

/**
 * Title: AbstractFactory <br>
 * ProjectName: learn-design <br>
 * description: 抽象工厂 <br>
 * 提供一个接口，用于创建相关的对象家族
 *
 * 抽象工厂模式创建的是对象家族，也就是很多对象而不是一个对象，并且这些对象是相关的，也就是说必须一起创建出来。而工厂方法模式只是用于创建一个对象，这和抽象工厂模式有很大不同
 * 从高层角度看。工厂方法使用的是继承，而抽象工厂用的是组合
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/2 15:02 <br>
 */
public abstract class AbstractFactory {

    abstract AbstractProductA createProductA();

    abstract AbstractProductB createProductB();
}
