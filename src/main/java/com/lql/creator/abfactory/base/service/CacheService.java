package com.lql.creator.abfactory.base.service;

import java.util.concurrent.TimeUnit;

/**
 * Title: CacheService <br>
 * ProjectName: learn-design <br>
 * description: redis服务接口 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 10:32 <br>
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
