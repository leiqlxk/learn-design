package com.lql.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Customer <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/6 15:12 <br>
 */
public class Customer implements Element{

    private String name;
    private List<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void addOrder(Order order) {
        orders.add(order);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order : orders) {
            order.accept(visitor);
        }
    }
}
