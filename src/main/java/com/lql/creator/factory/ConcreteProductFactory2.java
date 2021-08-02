package com.lql.creator.factory;

import com.lql.creator.simplefactory.ConcreteProduct1;
import com.lql.creator.simplefactory.ConcreteProduct2;
import com.lql.creator.simplefactory.Product;

/**
 * Title: ConcreteProduct <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/2 15:16 <br>
 */
public class ConcreteProductFactory2 extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
