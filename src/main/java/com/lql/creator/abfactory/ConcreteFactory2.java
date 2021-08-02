package com.lql.creator.abfactory;

/**
 * Title: ConcreteFactory2 <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/2 15:04 <br>
 */
public class ConcreteFactory2 extends AbstractFactory{
    @Override
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB2();
    }
}
