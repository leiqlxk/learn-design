package com.lql.behavior.mediator;

/**
 * Title: Mediator <br>
 * ProjectName: learn-design <br>
 * description: 中介者模式 <br>
 * 集中相关对象之间复杂的沟通和控制方式
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/4 10:52 <br>
 */
public abstract class Mediator {

    public abstract void doEvent(String eventType);
}
