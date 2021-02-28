package com.lql.creator.factory.base;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Title: PrizeController <br>
 * ProjectName: learn-design <br>
 * description: 奖品发放基础实现，即一坨坨的代码（if else） <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/2/28 16:58 <br>
 */
public class PrizeController {

    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    /**
     * description: 发放奖品（if else），非常直接的实现出来业务需求的一坨代码， <br>
     *     目前看来并不会有什么问题，但如果在经过几次的迭代和拓展，接手这段代码的研发 <br>
     *     将十分痛苦。重构成本高，需要清理之前每一个接口的使用，测试回归验证时间长 <br>
     *
     * @author: leiql <br>
     * @version: 1.0 <br>
     * @since: 2021/2/28 21:28 <br>
     *
     * @throws
     * @param req
     * @return com.lql.creator.factory.base.AwardRes
     */
    public AwardRes awardToUser(AwardReq req) {
        String reqJson = JSON.toJSONString(req);

        AwardRes awardRes = null;

        try {
            logger.info("奖品发放开始{}。req:{}", req.getuId(), reqJson);
            //按照不同类型分发商品你[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
            if (req.getAwardType() == 1) {
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(req.getuId(), req.getAwardNumber(), req.getBizId());
                if ("0000".equals(couponResult.getCode())) {
                    awardRes = new AwardRes("0000", "发放成功");
                }else {
                    awardRes = new AwardRes("0001", couponResult.getInfo());
                }
            }else if (req.getAwardType() == 2) {
                GoodService goodService = new GoodService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(req.getuId()));
                deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
                deliverReq.setSku(req.getAwardNumber());
                deliverReq.setOrderId(req.getBizId());
                deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
                deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));

                Boolean isSuccess = goodService.deliverGoods(deliverReq);
                if (isSuccess) {
                    awardRes = new AwardRes("0000", "发放成功");
                }else {
                    awardRes = new AwardRes("0001", "发放失败");
                }
            }else if (req.getAwardType() == 3) {
                String bindMobileNumer = "123132123132";
                IQiYiCardService iQiYiCardService  = new IQiYiCardService();
                iQiYiCardService.grantToken(bindMobileNumer, req.getAwardNumber());
                awardRes = new AwardRes("0000", "发放成功");
            }

            logger.info("奖品发放完成{}。", req.getuId());
        }catch (Exception e) {
            logger.error("奖品发放失败{}。req:{}", req.getuId(), reqJson);

            awardRes = new AwardRes("0001", e.getMessage());
        }

        return awardRes;
    }

    private String queryUserName(Long uId) {
        return "张三";
    }
    private String queryUserPhoneNumber(Long uId) {
        return "15200101232";
    }
}
