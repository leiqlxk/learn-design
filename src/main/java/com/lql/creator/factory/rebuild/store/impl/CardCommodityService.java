package com.lql.creator.factory.rebuild.store.impl;

import com.alibaba.fastjson.JSON;
import com.lql.creator.factory.base.IQiYiCardService;
import com.lql.creator.factory.rebuild.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Title: CardCommodityService <br>
 * ProjectName: learn-design <br>
 * description: 第三方兑换卡处理类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/2/28 22:11 <br>
 */
public class CardCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(Long uId, String commodityId, Long bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, commodityId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId： " +
                "{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(Long uId) {
        return "15200101232";
    }
}
