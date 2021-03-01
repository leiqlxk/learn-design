package com.lql.creator.abfactory.base.service;

import java.util.concurrent.TimeUnit;

/**
 * Title: RetrofitCacheService <br>
 * ProjectName: learn-design <br>
 * description: 集群改造的redis服务接口 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 10:41 <br>
 */
public interface RetrofitCacheService {

    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);
}
