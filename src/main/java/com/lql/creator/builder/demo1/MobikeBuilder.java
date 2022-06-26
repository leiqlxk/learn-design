package com.lql.creator.builder.demo1;

/**
 * Title: MobikeBuilder <br>
 * ProjectName: learn-design <br>
 * description: 摩拜单车建造者类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 18:04 <br>
 */
public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        super.bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        super.bike.setSeat("真皮座椅");
    }

    @Override
    public Bike createBike() {
        return super.bike;
    }
}
