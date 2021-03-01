package com.lql.creator.abfactory.base.matter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * Title: IIR <br>
 * ProjectName: learn-design <br>
 * description: 模拟集群IIR <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 10:07 <br>
 */
public class IIR {
    private Logger logger = LoggerFactory.getLogger(IIR.class);

    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        logger.info("IIR获取数据 key:{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("IIR写入数据 key:{} data:{}", key, value);
        dataMap.put(key, value);
    }

    public void setExpire(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("IIR写入数据 key:{} val:{} timeout:{} timeUnit:{}", key, value, timeout, timeUnit.toString());
        dataMap.put(key, value);
    }

    public void del(String key) {
        logger.info("IIR删除数据 key:{}", key);
        dataMap.remove(key);
    }
}
