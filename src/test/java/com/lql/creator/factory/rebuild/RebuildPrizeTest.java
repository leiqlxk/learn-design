package com.lql.creator.factory.rebuild;

import com.lql.creator.factory.rebuild.store.ICommodity;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: RebuildPrizeTest <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/2/28 22:20 <br>
 */
public class RebuildPrizeTest {

    @Test
    public void test_commodity() throws Exception {
        StoreFactory storeFactory = new StoreFactory();
        // 1. 优惠券
        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity(10001L, "EGM1023938910232121323432",
                791098764902132L, null);

        // 2. 实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        Map<String,String> extMap = new HashMap<String,String>();
        extMap.put("consigneeUserName", "李四");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.⻓春市.双阳区.XX街道.檀溪苑⼩" +
                "区.#18-2109");
        commodityService_2.sendCommodity(10001L,"9820198721311",
                1023000020112221113L, extMap);

        // 3. 第三⽅兑换卡(爱奇艺)
        ICommodity commodityService_3 = storeFactory.getCommodityService(3);

        commodityService_3.sendCommodity(10001L,"AQY1xjkUodl8LO975GdfrYUio",null
                ,null);
    }
}
