package com.lql.creator.singleton;

/**
 * Title: LazySingletonSync <br>
 * ProjectName: learn-design <br>
 * description: 懒汉式-线程安全 <br>
 *
 * 此模式通过对getLazySingletonSync()方法加锁，避免了多线程环境下多次实例化的问题
 * 但是当一个线程进入该方法后，其它视图进入该方法的线程必须等待，即使lazySingletonSync已经被实例化了，这会导致性能下降
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/7/30 16:50 <br>
 */
public class LazySingletonSync {

    private static LazySingletonSync lazySingletonSync;

    private LazySingletonSync() {}

    public static synchronized LazySingletonSync getLazySingletonSync() {
        if (lazySingletonSync == null) {
            lazySingletonSync = new LazySingletonSync();
        }

        return lazySingletonSync;
    }
}
