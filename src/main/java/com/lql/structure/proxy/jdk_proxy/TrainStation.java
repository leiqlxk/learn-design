package com.lql.structure.proxy.jdk_proxy;

/**
 * Title: TransStation <br>
 * ProjectName: learn-design <br>
 * description: 目标类对象 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 19:43 <br>
 */
public class TrainStation implements SellTickt {
    @Override
    public void sell() {
        System.out.println("火车站售卖车票");
    }
}
