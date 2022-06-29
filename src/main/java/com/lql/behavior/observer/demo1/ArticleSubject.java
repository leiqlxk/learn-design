package com.lql.behavior.observer.demo1;

import java.util.Observable;

/**
 * Title: ArticleSubject <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:21 <br>
 */
public class ArticleSubject extends Observable {

    public void updateState(String msg) {
        super.setChanged();
        super.notifyObservers(msg);
    }
}
