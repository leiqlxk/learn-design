package com.lql.structure.proxy.static_proxy;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 19:46 <br>
 */
public class Client {

    public static void main(String[] args) {
        StaticProxy proxy = new StaticProxy();
        proxy.sell();
    }
}
