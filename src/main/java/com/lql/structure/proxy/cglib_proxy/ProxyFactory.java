package com.lql.structure.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Title: ProxyFactory <br>
 * ProjectName: learn-design <br>
 * description: cglib代理类，其基于父类产生子类作为代理类, 1.8之后jdk的动态代理性能更高 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 19:57 <br>
 */
public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();

    public SellTickt getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(trainStation.getClass());
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("代理加收服务费");
            SellTickt result = (SellTickt) methodProxy.invokeSuper(o, objects);
            return result;
        });

        SellTickt proxy = (SellTickt) enhancer.create();
        return proxy;
    }
}
