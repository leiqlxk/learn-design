package com.lql.creator.factory.rebuild.store.impl;

import com.alibaba.fastjson.JSON;
import com.lql.creator.factory.base.CouponResult;
import com.lql.creator.factory.base.CouponService;
import com.lql.creator.factory.rebuild.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Title: CouponCommodityService <br>
 * ProjectName: learn-design <br>
 * description: 优惠券处理类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/2/28 21:59 <br>
 */
public class CouponCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(Long uId, String commodityId, Long bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId:{} commodityId:{} bizId:{} extMap:{}",
                uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]:{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) {
            throw  new RuntimeException(couponResult.getInfo());
        }
    }
}
