package com.lql.structure.decorate;

/**
 * Title: Decorate <br>
 * ProjectName: learn-design <br>
 * description: 抽象装饰器，装饰器模式相比于代理模式更关注的是增强而非隐藏目标对象，而且可以带来比继承更灵活的扩展性，装饰器和构建可以独立发展，没有耦合 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 21:05 <br>
 */
public abstract class Decorate extends FastFood {

    protected FastFood fastFood;

    public Decorate(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
