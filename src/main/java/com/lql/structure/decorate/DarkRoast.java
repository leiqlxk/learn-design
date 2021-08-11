package com.lql.structure.decorate;

/**
 * Title: DarkRoast <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/11 10:40 <br>
 */
public class DarkRoast implements Beverage{
    @Override
    public double cost() {
        return 1;
    }
}
