package com.lql.structure.decorate;

/**
 * Title: FridRice <br>
 * ProjectName: learn-design <br>
 * description: 具体构件 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 21:13 <br>
 */
public class FridRice extends FastFood{

    public FridRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
