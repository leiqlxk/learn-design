package com.lql.structure.decorate;

/**
 * Title: CondimentDecorator <br>
 * ProjectName: learn-design <br>
 * description: 装饰器模式 <br>
 * 为对象动态添加功能。
 *
 * 装饰者（Decorator）和具体组件（ConcreteComponent）都继承自组件（Component），具体组件的方法实现不需要依赖于其它对象，而装饰者组合了一个组件，
 * 这样它可以装饰其它装饰者或者具体组件。所谓装饰，就是把这个装饰者套在被装饰者之上，从而动态扩展被装饰者的功能。装饰者的方法有一部分是自己的，
 * 这属于它的功能，然后调用被装饰者的方法实现，从而也保留了被装饰者的功能。可以看到，具体组件应当是装饰层次的最低层，因为只有具体组件的方法实现不需要依赖于其它对象。
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/11 10:41 <br>
 */
public abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage;
}