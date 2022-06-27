package com.lql.behavior.strategy;

/**
 * Title: SaleMan <br>
 * ProjectName: learn-design <br>
 * description: 环境类，其通过聚合策略抽象类来动态的使用不同策略 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 21:40 <br>
 */
public class SaleMan {

    private Strategy strategy;

    public SaleMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void saleManShow() {
        this.strategy.show();
    }
}
