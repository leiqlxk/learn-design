package com.lql.behavior.command;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:27 <br>
 */
public class Client {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        Order order = new Order();
        order.setTableNum(1);
        order.setFoodDic("干锅包菜", 1);
        order.setFoodDic("干锅田鸡", 1);
        OrderCommand orderCommand = new OrderCommand(order, new Chef());

        waiter.addCommand(orderCommand);
        waiter.orderUp();
    }
}
