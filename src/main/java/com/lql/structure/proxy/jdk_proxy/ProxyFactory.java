package com.lql.structure.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

/**
 * Title: ProxyFactory <br>
 * ProjectName: learn-design <br>
 * description: jdk动态代理类，jdk动态代理使用Proxy方法，其基于接口生成代理类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 19:50 <br>
 */
public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();

    public SellTickt getProxyObject() {
        SellTickt instance = (SellTickt) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("代理加收服务费");
                    Object result = method.invoke(trainStation, args);
                    return result;
                }
        );
        return instance;
    }
}
