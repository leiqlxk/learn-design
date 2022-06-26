package com.lql.structure.decorate;

/**
 * Title: Bacon <br>
 * ProjectName: learn-design <br>
 * description: 具体装饰器 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 21:20 <br>
 */
public class Bacon extends Decorate{
    public Bacon(FastFood fastFood) {
        super(3, "培根", fastFood);
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
