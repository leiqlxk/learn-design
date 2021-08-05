package com.lql.behavior.observer;

/**
 * Title: Subject <br>
 * ProjectName: learn-design <br>
 * description: 观察者模式 <br>
 * 定义对象之间的一对多依赖，当一个对象改变状态时，它的所有依赖都会收到通知并且自动更新状态，主题是被观察的对象，而其所有依赖者被称为观察者
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/5 17:24 <br>
 */
public interface Subject {

    void registerObserver(Oberserver o);

    void removeObserver(Oberserver o);

    void notifyObject();
}
