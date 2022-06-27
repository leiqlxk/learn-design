package com.lql.structure.flyweight;

/**
 * Title: Block <br>
 * ProjectName: learn-design <br>
 * description: 抽象类将内部因素和外部因素区分开，外部因素由外部传入 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 20:55 <br>
 */
public abstract class Block {

    public abstract String getShap();

    public void display(String color) {
        System.out.println("方块形状: " + getShap() + ", 颜色: " + color);
    }
}
