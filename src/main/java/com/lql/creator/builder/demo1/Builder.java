package com.lql.creator.builder.demo1;

/**
 * Title: Builder <br>
 * ProjectName: learn-design <br>
 * description: 抽象建造者类 <br>
 * 工厂模式关注的是生产哪种产品，而建造者模式关注的是产品建造的过程，将复杂对象构成拆分成一个个步骤，再按一定的顺序将构件组装起来
 * 装配在类的功能也可以放在抽象建造者模式中充当模板方法，但构件的顺序就固定死了
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 17:56 <br>
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
