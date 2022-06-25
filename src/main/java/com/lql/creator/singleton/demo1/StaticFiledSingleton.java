package com.lql.creator.singleton.demo1;

/**
 * Title: StaticFiledSingleton <br>
 * ProjectName: learn-design <br>
 * description: 静态属性单例类 <br>
 *              类加载就会实例化并且只实例化一次，没有线程安全问题
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 19:52 <br>
 */
public class StaticFiledSingleton {

    private StaticFiledSingleton() {}

    private static final StaticFiledSingleton STATIC_FILED_SINGLETON = new StaticFiledSingleton();

    private static StaticFiledSingleton getInstance() {
        return STATIC_FILED_SINGLETON;
    }
}
