package com.lql.behavior.observer;

/**
 * Title: StatisticsDisplay <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/5 17:35 <br>
 */
public class StatisticsDisplay implements Oberserver{

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay: " + temp + " " + humidity + " " + pressure);
    }
}
