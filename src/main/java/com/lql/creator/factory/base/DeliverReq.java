package com.lql.creator.factory.base;

/**
 * Title: DeliverReq <br>
 * ProjectName: learn-design <br>
 * description: 递送商品入参 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/2/28 20:59 <br>
 */
public class DeliverReq {

    //用户名称
    private String userName;

    //用户ID
    private Long uId;

    //用户电话
    private String userPhone;

    //商品sku
    private String sku;

    //订单号
    private Long orderId;

    //收货人姓名
    private String consigneeUserName;

    //收货人电话
    private String consigneeUserPhone;

    //收货人地址
    private String consigneeUserAddress;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getConsigneeUserName() {
        return consigneeUserName;
    }

    public void setConsigneeUserName(String consigneeUserName) {
        this.consigneeUserName = consigneeUserName;
    }

    public String getConsigneeUserPhone() {
        return consigneeUserPhone;
    }

    public void setConsigneeUserPhone(String consigneeUserPhone) {
        this.consigneeUserPhone = consigneeUserPhone;
    }

    public String getConsigneeUserAddress() {
        return consigneeUserAddress;
    }

    public void setConsigneeUserAddress(String consigneeUserAddress) {
        this.consigneeUserAddress = consigneeUserAddress;
    }
}
