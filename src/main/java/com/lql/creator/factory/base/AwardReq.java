package com.lql.creator.factory.base;

import java.util.Map;

/**
 * Title: AwardReq <br>
 * ProjectName: learn-design <br>
 * description: 奖品入参对象 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/2/28 17:01 <br>
 */
public class AwardReq {

    // 用户id
    private Long uId;

    // 奖品类型
    private Integer awardType;

    //奖品号
    private String awardNumber;

    //业务id
    private Long bizId;

    private Map<String, String> extMap;

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }

    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }
}
