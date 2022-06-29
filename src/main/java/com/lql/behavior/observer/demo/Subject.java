package com.lql.behavior.observer.demo;

/**
 * Title: Subject <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:14 <br>
 */
public interface Subject {

    void attach(Observer observer);

    void detach(Observer  observer);

    void notify(String msg);
}
