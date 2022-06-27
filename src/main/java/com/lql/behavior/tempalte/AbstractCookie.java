package com.lql.behavior.tempalte;

/**
 * Title: AbstractCookie <br>
 * ProjectName: learn-design <br>
 * description: 定义算法框架、公共方法以及抽象方法，通过父类去调用子类的方法实现 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/27 21:24 <br>
 */
public abstract class AbstractCookie {

    public final void cookieProcess() {
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    public void pourOil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();

    public void fry() {
        System.out.println("翻炒");
    }
}
