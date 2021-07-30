package com.lql.creator.singleton;

/**
 * Title: InnerStaticSingleton <br>
 * ProjectName: learn-design <br>
 * description: 静态内部类实现 <br>
 *
 * 当InnerStaticSingleton类被加载时，静态内部类SingletonHolder没有被加载进内存。只有当调用getInstance()方法从而触发 SingletonHolder.INNER_STATIC_SINGLETON 时SingletonHolder才会被加载
 * 此时初始化INNER_STATIC_SINGLETON实例，并且jvm确保常量只被初始化一次
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/7/30 17:26 <br>
 */
public class InnerStaticSingleton {

    private InnerStaticSingleton() {}

    private static class SingletonHolder {
        private static final InnerStaticSingleton INNER_STATIC_SINGLETON = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance() {
        return SingletonHolder.INNER_STATIC_SINGLETON;
    }
}
