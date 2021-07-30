package com.lql.creator.singleton;

/**
 * Title: DoubbleCheckSingleton <br>
 * ProjectName: learn-design <br>
 * description: 双重校验锁-线程安全 <br>
 *
 * 双重校验锁先判断 uniqueInstance 是否已经被实例化，如果没有被实例化，那么才对实例化语句进行加锁。只需要被实例化一次，之后就可以直接使用了。加锁操作只需要对实例化那部分的代码进行，
 * 只有当 doubleCheckSingleton 没有被实例化时，才需要进行加锁。但是当多个线程同时进入第一个if语句后虽然在同步块会等待，但是都会先后进入同步块还是会造成多次实例化，因此在进入同步块后还是要进行一个
 * if判断，此为双重检测
 *
 * doubleCheckSingleton采用volatile关键字修饰的原因是doubleCheckSingleton = new DoubleCheckSingleton();代码的执行分成以下三步：
 * 1. 为doubleCheckSingleton分配内存空间
 * 2. 初始化doubleCheckSingleton
 * 3. 将doubleCheckSingleton指向分配的内存地址
 * 由于jvm具有指令重排的特性，执行顺序有可能变成1>3>2，指令重拍在单线程下不会出现问题，但是在多线程环境下回导致一个线程获得还没有初始化的实例。例如，线程 T1 执行了 1 和 3，
 * 此时 T2 调用 getUniqueInstance() 后发现 uniqueInstance 不为空，因此返回 uniqueInstance，但此时 uniqueInstance 还未被初始化。
 * 使用volatile可以禁止指令重排序，保证多线程下也能安全运行
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/7/30 16:54 <br>
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getDoubleCheckSingleton() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }

        return doubleCheckSingleton;
    }
}
