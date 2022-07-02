package com.lql.definition_springIOC.framework.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Title: MutablePropertyValue <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 16:15 <br>
 */
public class MutablePropertyValue implements Iterable<PropertyValue>{

    private List<PropertyValue> values;

    public MutablePropertyValue() {
        this.values =new ArrayList<>();
    }

    public MutablePropertyValue(List<PropertyValue> values) {
        if (values == null || values.isEmpty()) {
            this.values = new ArrayList<>();
        }else {
            this.values = values;
        }
    }

    public MutablePropertyValue add(PropertyValue propertyValue) {
        for (int i = 0; i < this.values.size(); i++) {
            PropertyValue currentProperty = this.values.get(i);
            if (currentProperty.getName().equals(propertyValue.getName())) {
                this.values.set(i, propertyValue);
                return this;
            }
        }

        this.values.add(propertyValue);
        return this;
    }

    public PropertyValue getPropertyValue(String name) {
        List<PropertyValue> collect = this.values.stream().filter(item -> item.getName().equals(name)).collect(Collectors.toList());

        if (collect.isEmpty()) {
            return null;
        }

        return collect.get(0);
    }

    public PropertyValue[] getPropertyValues() {
        return this.values.toArray(new PropertyValue[0]);
    }

    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public boolean contain(String name) {
        return getPropertyValue(name) != null;
    }

    @Override
    public Iterator<PropertyValue> iterator() {
        return this.values.iterator();
    }
}
