package com.lql.behavior.command;

import java.util.Set;

/**
 * Title: OrderCommand <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:18 <br>
 */
public class OrderCommand implements Command{

    private Order order;
    private Chef chef;

    public OrderCommand(Order order, Chef chef) {
        this.order = order;
        this.chef = chef;
    }

    @Override
    public void exec() {
        System.out.println(this.order.getTableNum() + "号桌订餐：");

        Set<String> strings = this.order.getFoodDic().keySet();
        for (String string : strings) {
            this.chef.makeFood(string, this.order.getFoodDic().get(string));
        }

        System.out.println("菜已上齐。。。。");

    }
}
