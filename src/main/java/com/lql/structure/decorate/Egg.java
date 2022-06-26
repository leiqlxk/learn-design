package com.lql.structure.decorate;

/**
 * Title: Egg <br>
 * ProjectName: learn-design <br>
 * description:具体装饰器 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 21:16 <br>
 */
public class Egg extends Decorate{


    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        return super.getPrice() + super.fastFood.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + super.fastFood.getDesc();
    }
}
