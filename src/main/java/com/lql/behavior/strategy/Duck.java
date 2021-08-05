package com.lql.behavior.strategy;

/**
 * Title: Duck <br>
 * ProjectName: learn-design <br>
 * description: 策略模式 <br>
 * 定义一系列算法，封装每个算法，并使它们可以互换，策略模式可以让算法独立于使用它的客户端
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/5 17:08 <br>
 */
public class Duck {

    private QuackBehavior quackBehavior;

    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
