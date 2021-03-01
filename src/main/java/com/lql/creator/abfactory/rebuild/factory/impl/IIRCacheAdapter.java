package com.lql.creator.abfactory.rebuild.factory.impl;

import com.lql.creator.abfactory.base.matter.IIR;
import com.lql.creator.abfactory.rebuild.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * Title: IIRCacheAdapter <br>
 * ProjectName: learn-design <br>
 * description: IIR集群使用服务 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 11:14 <br>
 */
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
