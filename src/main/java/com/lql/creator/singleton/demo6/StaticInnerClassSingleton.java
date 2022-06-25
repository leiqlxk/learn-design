package com.lql.creator.singleton.demo6;

/**
 * Title: StaticInnerClassSingleton <br>
 * ProjectName: learn-design <br>
 * description: 静态内部类单例，属于懒汉式且没有线程安全问题 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 20:11 <br>
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {}

    private static class SingleHolder {
        private static final StaticInnerClassSingleton SINGLETON = new StaticInnerClassSingleton();

    }

    public static StaticInnerClassSingleton getInstance() {
        return SingleHolder.SINGLETON;
    }
}
