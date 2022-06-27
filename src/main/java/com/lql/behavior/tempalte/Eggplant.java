package com.lql.behavior.tempalte;

/**
 * Title: Eggplant <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 21:31 <br>
 */
public class Eggplant extends AbstractCookie{
    @Override
    public void pourVegetable() {
        System.out.println("倒入茄子");
    }

    @Override
    public void pourSauce() {
        System.out.println("倒入蒜蓉");
    }
}
