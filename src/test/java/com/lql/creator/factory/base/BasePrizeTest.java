package com.lql.creator.factory.base;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: BasePrizeTest <br>
 * ProjectName: learn-design <br>
 * description: if else实现发放奖品测试类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/2/28 21:32 <br>
 */
public class BasePrizeTest {

    private Logger logger = LoggerFactory.getLogger(BasePrizeTest.class);

    @Test
    public void test_awardToUser() {
        PrizeController prizeController = new PrizeController();
        System.out.println("\r\n模拟发放优惠券测试\r\n");
        AwardReq req = new AwardReq();
        req.setuId(1L);
        req.setAwardType(1);
        req.setAwardNumber("EGM123123123123123123");
        req.setBizId(121L);
        AwardRes awardRes = prizeController.awardToUser(req);
        logger.info("请求参数:{}", JSON.toJSON(req));
        logger.info("测试结果:{}", JSON.toJSON(awardRes));

        System.out.println("\r\n模拟⽅法实物商品\r\n");
        AwardReq req1 = new AwardReq();
        req1.setuId(2L);
        req1.setAwardType(2);
        req1.setAwardNumber("4567456456456456");
        req1.setBizId(2123123L);
        Map<String, String> extMap = new HashMap<>();
        extMap.put("consigneeUserName", "李四");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.⻓春市.双阳区.XX街道.檀溪苑⼩区.#18-2109");
        req1.setExtMap(extMap);
        AwardRes awardRes1 = prizeController.awardToUser(req1);
        logger.info("请求参数:{}", JSON.toJSON(req1));
        logger.info("测试结果:{}", JSON.toJSON(awardRes1));

        System.out.println("\r\n第三方兑换卡（爱奇艺）\r\n");
        AwardReq req2 = new AwardReq();
        req2.setuId(3L);
        req2.setAwardType(3);
        req2.setAwardNumber("dasfasdf12415324afdsf");
        AwardRes awardRes2 = prizeController.awardToUser(req2);
        logger.info("请求参数:{}", JSON.toJSON(req2));
        logger.info("测试结果:{}", JSON.toJSON(awardRes2));


    }
}
