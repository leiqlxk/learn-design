package com.lql.behavior.responsibility;

/**
 * Title: Handler <br>
 * ProjectName: learn-design <br>
 * description: 责任链模式 <br>
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链发送请求，直到有一个对象处理它为止。
 *
 * 定义处理请求的接口，并且实现后继链
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/3 11:21 <br>
 */
public abstract class Handler {

    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);
}
