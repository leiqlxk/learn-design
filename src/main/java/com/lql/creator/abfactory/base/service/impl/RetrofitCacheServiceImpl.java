package com.lql.creator.abfactory.base.service.impl;

import com.lql.creator.abfactory.base.RedisUtils;
import com.lql.creator.abfactory.base.matter.EGM;
import com.lql.creator.abfactory.base.matter.IIR;
import com.lql.creator.abfactory.base.service.RetrofitCacheService;

import java.util.concurrent.TimeUnit;

/**
 * Title: RetrofitCacheServiceImpl <br>
 * ProjectName: learn-design <br>
 * description: 集群改造的redis服务实现类,实现过程非常简单,但是对使用者来说就麻烦了,并且也很难应对后期的拓展和不听的维护 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 10:39 <br>
 */
public class RetrofitCacheServiceImpl implements RetrofitCacheService {

    private RedisUtils redisUtils = new RedisUtils();

    private EGM egm = new EGM();

    private IIR iir = new IIR();

    @Override
    public String get(String key, int redisType) {
        if (1 == redisType) {
            return egm.gain(key);
        }

        if (2 == redisType) {
            return iir.get(key);
        }

        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value, int redisType) {
        if (1 == redisType) {
            egm.set(key, value);
        }

        if (2 == redisType) {
            iir.set(key, value);
        }

        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {
        if (1 == redisType) {
            egm.setEx(key, value, timeout, timeUnit);
        }

        if (2 == redisType) {
            iir.setExpire(key, value, timeout, timeUnit);
        }

        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key, int redisType) {
        if (1 == redisType) {
            egm.delete(key);
        }

        if (2 == redisType) {
            iir.del(key);
        }

        redisUtils.del(key);
    }
}
