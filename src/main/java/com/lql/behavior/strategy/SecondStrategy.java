package com.lql.behavior.strategy;

/**
 * Title: SecondStrategy <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 21:38 <br>
 */
public class SecondStrategy implements Strategy{
    @Override
    public void show() {
        System.out.println("满两百减五十");
    }
}
