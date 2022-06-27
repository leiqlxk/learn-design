package com.lql.behavior.tempalte;

/**
 * Title: FriedCabbage <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 21:30 <br>
 */
public class FriedCabbage extends AbstractCookie{
    @Override
    public void pourVegetable() {
        System.out.println("倒入包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("倒入辣椒");
    }
}
