package com.lql.creator.singleton.demo8;

import java.io.Serializable;

/**
 * Title: StaticInnerClassSingleton <br>
 * ProjectName: learn-design <br>
 * description: 静态内部类单例，属于懒汉式且没有线程安全问题 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 20:11 <br>
 */
public class StaticInnerClassSingleton implements Serializable {

    private StaticInnerClassSingleton() {}

    private static class SingleHolder {
        private static final StaticInnerClassSingleton SINGLETON = new StaticInnerClassSingleton();

    }

    public static StaticInnerClassSingleton getInstance() {
        return SingleHolder.SINGLETON;
    }

    // 此方法可以防止反序列化破坏
    private Object readResolve() {
        return SingleHolder.SINGLETON;
    }
}
