package com.lql.behavior.tempalte;

/**
 * Title: CoffeeBeverage <br>
 * ProjectName: learn-design <br>
 * description: 模板方法 <br>
 * 定义算法框架及定义流程，并将每个子步骤的实现延迟到子类，通过模板方法子类可以重新定义算法的某些步骤，而不用改变算法的结构
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/5 17:15 <br>
 */
public abstract class CoffeeBeverage {

    final void prepareRecipe() {
        boilwater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();

    abstract void pourInCup();

    abstract void brew();

    abstract void boilwater();
}
