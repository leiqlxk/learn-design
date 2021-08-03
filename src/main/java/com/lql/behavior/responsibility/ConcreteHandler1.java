package com.lql.behavior.responsibility;

/**
 * Title: ConcreteHandler1 <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/3 11:27 <br>
 */
public class ConcreteHandler1 extends Handler{
    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.TYPE1) {
            System.out.println(request.getName() + " is handle by ConcreteHandler1");
            return;
        }

        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
