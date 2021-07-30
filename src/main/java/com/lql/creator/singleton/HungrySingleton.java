package com.lql.creator.singleton;

/**
 * Title: HungrySingleton <br>
 * ProjectName: learn-design <br>
 * description: 饿汉模式 <br>
 * 此模式解决了线程安全问题，但同时失去了延迟初始化带来的节约资源的好处
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/7/30 16:48 <br>
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
