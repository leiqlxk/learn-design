package com.lql.structure.flyweight;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 21:05 <br>
 */
public class Client {

    public static void main(String[] args) {
        Flyweight instance = Flyweight.getInstance();
        Block block = instance.getBlock("I");
        block.display("红色");

        Block block1 = instance.getBlock("I");
        block1.display("绿色");
        System.out.println(block == block1);
    }
}
