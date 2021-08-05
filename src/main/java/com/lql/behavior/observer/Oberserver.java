package com.lql.behavior.observer;

/**
 * Title: Oberserver <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/5 17:25 <br>
 */
public interface Oberserver {

    void update(float temp, float humidity, float pressure);
}
