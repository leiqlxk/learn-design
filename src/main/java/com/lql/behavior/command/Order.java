package com.lql.behavior.command;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Order <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:02 <br>
 */
public class Order {

    private int tableNum;

    private Map<String, Integer> foodDic = new HashMap<>();

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name, int count) {
        this.foodDic.put(name, count);
    }
}
