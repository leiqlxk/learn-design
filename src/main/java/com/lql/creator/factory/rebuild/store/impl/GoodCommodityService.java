package com.lql.creator.factory.rebuild.store.impl;

import com.alibaba.fastjson.JSON;
import com.lql.creator.factory.base.DeliverReq;
import com.lql.creator.factory.base.GoodService;
import com.lql.creator.factory.rebuild.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Title: GoodCommodityService <br>
 * ProjectName: learn-design <br>
 * description: 实物奖品处理类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/2/28 22:07 <br>
 */
public class GoodCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(GoodCommodityService.class);

    private GoodService goodService = new GoodService();

    @Override
    public void sendCommodity(Long uId, String commodityId, Long bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodService.deliverGoods(deliverReq);

        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} " +
                "extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", isSuccess);
        if (!isSuccess) {
            throw new RuntimeException("实物商品发放失败");
        }
    }

    private String queryUserName(Long uId) {
        return "张三";
    }
    private String queryUserPhoneNumber(Long uId) {
        return "15200101232";
    }
}
