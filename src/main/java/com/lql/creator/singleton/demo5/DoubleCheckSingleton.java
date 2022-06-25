package com.lql.creator.singleton.demo5;

/**
 * Title: DoubleCheckSingleton <br>
 * ProjectName: learn-design <br>
 * description: 懒汉式，双重校验锁，线程安全，并且使用volatile阻止指令重排序导致多线程下的空指针问题 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 20:05 <br>
 */
public class DoubleCheckSingleton {

    private DoubleCheckSingleton() {}

    private static volatile DoubleCheckSingleton singleton;

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }

        return singleton;
    }
}
