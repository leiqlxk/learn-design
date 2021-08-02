package com.lql.creator.simplefactory;

/**
 * Title: SimpleFactory <br>
 * ProjectName: learn-design <br>
 * description: 简单工厂模式 <br>
 * 在创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口
 *
 * 简单工厂把实例化的操作单独放在一个类中，这个类就成为了简单工厂，让简单工厂类来决定应该用哪个具体子类来实例化。
 * 这样就把客户类和具体子类解耦，客户类不再需要知道有哪些子类以及应当实例化哪个子类。如果不使用简单工厂，一旦子类发生变化，那么所有客户类都要进行修改
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/2 11:51 <br>
 */
public class SimpleFactory {

    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct();
        }else if (type == 2) {
            return new ConcreteProduct1();
        }

        return new ConcreteProduct2();
    }
}
