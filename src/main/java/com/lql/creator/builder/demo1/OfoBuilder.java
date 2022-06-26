package com.lql.creator.builder.demo1;

/**
 * Title: OfoBuilder <br>
 * ProjectName: learn-design <br>
 * description: ofo <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 18:05 <br>
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        super.bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        super.bike.setSeat("织布座椅");
    }

    @Override
    public Bike createBike() {
        return super.bike;
    }
}
