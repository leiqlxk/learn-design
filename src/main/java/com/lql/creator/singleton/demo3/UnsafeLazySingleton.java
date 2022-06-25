package com.lql.creator.singleton.demo3;

/**
 * Title: UnsafeLazySingleton <br>
 * ProjectName: learn-design <br>
 * description: 懒汉式单例类，有线程安全问题 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 20:01 <br>
 */
public class UnsafeLazySingleton {

    private UnsafeLazySingleton() {}

    private static UnsafeLazySingleton unsafeLazySingleton;

    public static UnsafeLazySingleton getInstance() {
        if (unsafeLazySingleton == null) {
            unsafeLazySingleton = new UnsafeLazySingleton();
        }

        return unsafeLazySingleton;
    }
}
