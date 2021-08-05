package com.lql.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: WeatherData <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/5 17:27 <br>
 */
public class WeatherData implements Subject{
    private List<Oberserver> oberservers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.oberservers = new ArrayList<>();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObject();
    }

    @Override
    public void registerObserver(Oberserver o) {
        this.oberservers.add(o);
    }

    @Override
    public void removeObserver(Oberserver o) {
        int index = this.oberservers.indexOf(o);
        if (index > 0) {
            this.oberservers.remove(index);
        }
    }

    @Override
    public void notifyObject() {
        for (Oberserver o : oberservers) {
            o.update(this.temp, this.humidity, this.pressure);
        }
    }
}
