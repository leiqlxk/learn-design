package com.lql.behavior.visitor;

/**
 * Title: Visitor <br>
 * ProjectName: learn-design <br>
 * description: 访问者模式 <br>
 * 为一个对象结构增加新能力
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/6 15:04 <br>
 */
public interface Visitor {

    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);
}
