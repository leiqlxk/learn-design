package com.lql.creator.builder.demo1;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 18:10 <br>
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());
        System.out.println(director.construct());
    }
}
