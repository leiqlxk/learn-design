package com.lql.creator.singleton.demo4;

/**
 * Title: SafeLazySingleton <br>
 * ProjectName: learn-design <br>
 * description: 懒汉式单例类，线程安全 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 20:03 <br>
 */
public class SafeLazySingleton {

    private SafeLazySingleton() {}

    private static SafeLazySingleton singleton;

    public static synchronized SafeLazySingleton getInstance() {
        singleton = new SafeLazySingleton();

        return singleton;
    }
}
