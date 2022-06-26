package com.lql.structure.proxy.static_proxy;

/**
 * Title: StaticProxy <br>
 * ProjectName: learn-design <br>
 * description: 静态代理对象 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 19:44 <br>
 */
public class StaticProxy implements SellTickt{
    private SellTickt sellTickt = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点加收服务费");
        sellTickt.sell();
    }
}
