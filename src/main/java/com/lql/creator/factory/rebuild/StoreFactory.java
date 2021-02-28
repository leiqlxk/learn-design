package com.lql.creator.factory.rebuild;

import com.lql.creator.factory.rebuild.store.ICommodity;
import com.lql.creator.factory.rebuild.store.impl.CardCommodityService;
import com.lql.creator.factory.rebuild.store.impl.CouponCommodityService;
import com.lql.creator.factory.rebuild.store.impl.GoodCommodityService;

/**
 * Title: StoreFactory <br>
 * ProjectName: learn-design <br>
 * description: 商店工厂 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/2/28 22:14 <br>
 */
public class StoreFactory {

    /**
     * description: 这里按照类型实现各种商品的服务。可以非常干净整洁的处理你的代码， <br>
     *     后续如果新增商品在这里可以扩展即可。如果不喜欢if可使用switch或者map配置结构，<br>
     *     让代码更干净。<br>
     *
     * @author: leiql <br>
     * @version: 1.0 <br>
     * @since: 2021/2/28 22:18 <br>
     *
     * @throws
     * @param commodityType
     * @return com.lql.creator.factory.rebuild.store.ICommodity
     */
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }

        if (1 == commodityType) {
            return new CouponCommodityService();
        }

        if (2 == commodityType) {
            return new GoodCommodityService();
        }

        if (3 == commodityType) {
            return new CardCommodityService();
        }

        throw new RuntimeException("不存在的商品服务类型");
    }
}
