package com.lql.creator.factory;

import com.lql.creator.simplefactory.Product;

/**
 * Title: Factory <br>
 * ProjectName: learn-design <br>
 * description: 工厂方法 <br>
 * 定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类
 *
 * 在简单工厂中，创建对象的是另一个类，而在工厂方法中，是由子类来创建对象
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/2 15:13 <br>
 */
public abstract class Factory {

    abstract  public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something
    }
}
