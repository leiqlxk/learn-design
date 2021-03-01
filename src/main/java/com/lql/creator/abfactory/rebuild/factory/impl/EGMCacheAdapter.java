package com.lql.creator.abfactory.rebuild.factory.impl;

import com.lql.creator.abfactory.base.matter.EGM;
import com.lql.creator.abfactory.rebuild.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * Title: EGMCacheAdapter <br>
 * ProjectName: learn-design <br>
 * description: EGM集群使用服务 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 11:13 <br>
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
