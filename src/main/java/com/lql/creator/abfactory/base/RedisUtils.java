package com.lql.creator.abfactory.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * Title: RedisUtils <br>
 * ProjectName: learn-design <br>
 * description: 模拟单机服务RedisUtils <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 10:07 <br>
 */
public class RedisUtils {

    private Logger logger = LoggerFactory.getLogger(RedisUtils.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        logger.info("Redis获取数据key:{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("Redis写入数据 key:{} val:{}", key, value);
        dataMap.put(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("Redis写入数据 key:{} val:{} timeout:{} timeUnit:{}", key, value, timeout, timeUnit.toString());
        dataMap.put(key, value);
    }

    public void del(String key) {
        logger.info("Redis删除数据 key:{}", key);
        dataMap.remove(key);
    }
}
