package com.lql.behavior.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: ArticleSubject <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:16 <br>
 */
public class ArticleSubject implements Subject{
    private List<Observer> observers;

    public ArticleSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notify(String msg) {
        for (Observer observer : this.observers) {
            observer.update(msg);
        }
    }
}
