package com.lql.creator.prototype.demo1;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 17:40 <br>
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();

        Prototype prototype1 = prototype.clone();

        System.out.println(prototype == prototype1);
    }
}
