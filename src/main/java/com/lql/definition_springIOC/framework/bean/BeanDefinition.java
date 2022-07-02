package com.lql.definition_springIOC.framework.bean;

/**
 * Title: BeanDefinition <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 16:25 <br>
 */
public class BeanDefinition {

    private String id;

    private String className;

    private MutablePropertyValue mutablePropertyValue;

    public BeanDefinition() {
        mutablePropertyValue = new MutablePropertyValue();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public MutablePropertyValue getMutablePropertyValue() {
        return mutablePropertyValue;
    }

    public void setMutablePropertyValue(MutablePropertyValue mutablePropertyValue) {
        this.mutablePropertyValue = mutablePropertyValue;
    }
}
