package com.lql.behavior.strategy;

/**
 * Title: ThirdStrategy <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 21:39 <br>
 */
public class ThirdStrategy implements Strategy{
    @Override
    public void show() {
        System.out.println("满一千换购");
    }
}
