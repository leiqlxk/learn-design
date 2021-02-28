package com.lql.creator.factory.base;

/**
 * Title: ConponService <br>
 * ProjectName: learn-design <br>
 * description: 优惠券service <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/2/28 20:48 <br>
 */
public class CouponService {

    /**
     * description: 发放优惠券 <br>
     *
     * @author: leiql <br>
     * @version: 1.0 <br>
     * @since: 2021/2/28 21:21 <br>
     *
     * @throws
     * @param getuId
     * @param awardNumber
     * @param bizId
     * @return com.lql.creator.factory.base.CouponResult
     */
    public CouponResult sendCoupon(Long getuId, String awardNumber, Long bizId) {
        CouponResult couponResult = new CouponResult();
        couponResult.setCode("0000");
        couponResult.setInfo("优惠券发放成功");
        return couponResult;
    }
}
