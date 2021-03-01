package com.lql.creator.abfactory.rebuild.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Title: JDKProxy <br>
 * ProjectName: learn-design <br>
 * description: 定义抽象工厂,此模式所要解决的问题就是在一个产品族存在多个不同类型的产品（redis集群、操作系统）情况下,<br>
 *     接口的选择问题。
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 11:13 <br>
 */
public class JDKProxy {

    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) throws  Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
    }
}
