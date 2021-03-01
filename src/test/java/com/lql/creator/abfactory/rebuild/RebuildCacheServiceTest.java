package com.lql.creator.abfactory.rebuild;

import com.lql.creator.abfactory.base.service.CacheService;
import com.lql.creator.abfactory.base.service.impl.CacheServiceImpl;
import com.lql.creator.abfactory.rebuild.factory.JDKProxy;
import com.lql.creator.abfactory.rebuild.factory.impl.EGMCacheAdapter;
import com.lql.creator.abfactory.rebuild.factory.impl.IIRCacheAdapter;
import org.junit.Test;

/**
 * Title: RebuildCacheServiceTest <br>
 * ProjectName: learn-design <br>
 * description: 重构后测试类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 11:50 <br>
 */
public class RebuildCacheServiceTest {

    @Test
    public void test_cache_service() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "张三");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "李四");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);
    }
}
