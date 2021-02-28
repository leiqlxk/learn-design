package com.lql.creator.factory.base;

/**
 * Title: AwardRes <br>
 * ProjectName: learn-design <br>
 * description: 奖品出参对象 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/2/28 17:02 <br>
 */
public class AwardRes {

    private String code;

    private String message;

    public AwardRes(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
