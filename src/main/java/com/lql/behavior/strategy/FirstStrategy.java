package com.lql.behavior.strategy;

/**
 * Title: FirstStrategy <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 21:37 <br>
 */
public class FirstStrategy implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
