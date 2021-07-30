package com.lql.creator.singleton;

/**
 * Title: LazySigleton <br>
 * ProjectName: learn-design <br>
 * description: 懒汉模式
 * 单例模式确保一个类只有一个实例，并提供该实例的全局访问点
 * 使用一个私有构造函数、一个私有静态变量以及一个公有静态函数返回唯一的私有静态变量
 *
 * 懒汉模式-线程不安全，私有静态变量 uniqueInstance 被延迟实例化，这样做的好处是，如果没有用到该类，那么就不会实例化 uniqueInstance，从而节约资源。
 * 但在多线程环境下是不安全的，如果多个线程同时if(uniqueInstance == null)，并且此时实例确实为null，那么会有多个线程执行new LazySingleton()，这将导致实例化多次uniqueInstance
 * <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/7/30 16:39 <br>
 */
public class LazySingleton {

    private static LazySingleton uniqueInstance;

    private LazySingleton() {}

    public static LazySingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }

        return uniqueInstance;
    }
}
