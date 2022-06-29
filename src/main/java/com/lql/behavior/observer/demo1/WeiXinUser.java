package com.lql.behavior.observer.demo1;

import java.util.Observable;
import java.util.Observer;

/**
 * Title: WeiXinUser <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:22 <br>
 */
public class WeiXinUser implements Observer {

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.name + "收到消息: " + arg);
    }
}
