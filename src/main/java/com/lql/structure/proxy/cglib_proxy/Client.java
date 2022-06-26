package com.lql.structure.proxy.cglib_proxy;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 20:07 <br>
 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickt proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
