package com.lql.creator.factory.abstr;

/**
 * Title: Mochat <br>
 * ProjectName: learn-design <br>
 * description: 抹茶慕斯 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 21:50 <br>
 */
public class Matcha implements Dessert{
    @Override
    public void show() {
        System.out.println("抹茶慕斯");
    }
}
