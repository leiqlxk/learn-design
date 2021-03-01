package com.lql.creator.abfactory.rebuild.factory;

import java.util.concurrent.TimeUnit;

/**
 * Title: ICacheAdapter <br>
 * ProjectName: learn-design <br>
 * description: 定义适配接口 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 11:12 <br>
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
