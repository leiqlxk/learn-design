package com.lql.creator.builder.demo1;

/**
 * Title: Director <br>
 * ProjectName: learn-design <br>
 * description: 装配者类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 18:06 <br>
 */
public class Director {

    public Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        this.builder.buildFrame();
        this.builder.buildSeat();

        return this.builder.bike;
    }
}
