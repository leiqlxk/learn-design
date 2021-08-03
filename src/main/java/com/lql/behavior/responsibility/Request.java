package com.lql.behavior.responsibility;


/**
 * Title: Request <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/3 11:23 <br>
 */
public class Request {

    private RequestType requestType;
    private String name;

    public Request(RequestType requestType, String name) {
        this.requestType = requestType;
        this.name = name;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getName() {
        return name;
    }
}
