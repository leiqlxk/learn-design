package com.lql.creator.abfactory.base;

import com.lql.creator.abfactory.base.service.CacheService;
import com.lql.creator.abfactory.base.service.RetrofitCacheService;
import com.lql.creator.abfactory.base.service.impl.RetrofitCacheServiceImpl;
import org.junit.Test;

/**
 * Title: Test_CacheService <br>
 * ProjectName: learn-design <br>
 * description: redis ifelse改造测试 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 11:01 <br>
 */
public class RetrofitCacheServiceTest {

    @Test
    public void test_CacheService() {
        RetrofitCacheService cacheService = new RetrofitCacheServiceImpl();
        cacheService.set("user_name_01", "张三", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println(val01);
    }
}
