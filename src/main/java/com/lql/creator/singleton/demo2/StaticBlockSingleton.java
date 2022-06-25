package com.lql.creator.singleton.demo2;

/**
 * Title: StaitcBlockSingleton <br>
 * ProjectName: learn-design <br>
 * description: 静态块单例类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 19:55 <br>
 */
public class StaticBlockSingleton {

    private StaticBlockSingleton() {}

    private static final StaticBlockSingleton STATIC_BLOCK_SINGLETON;

    static {
        STATIC_BLOCK_SINGLETON = new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance() {
        return STATIC_BLOCK_SINGLETON;
    }
}
