package com.lql.structure.decorate;

/**
 * Title: FriedNoodle <br>
 * ProjectName: learn-design <br>
 * description: 具体构件 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 21:15 <br>
 */
public class FriedNoodle extends FastFood {

    public FriedNoodle() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
