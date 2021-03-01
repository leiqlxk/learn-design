package com.lql.creator.abfactory.base.service.impl;

import com.lql.creator.abfactory.base.RedisUtils;
import com.lql.creator.abfactory.base.service.CacheService;

import java.util.concurrent.TimeUnit;

/**
 * Title: CacheServiceImpl <br>
 * ProjectName: learn-design <br>
 * description: 单机版redis服务实现类,目前的代码对于当前场景下的使用没什么问题，但所有的业务系统都在使用的同时，需要改造就不那么容易了。 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 10:34 <br>
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
