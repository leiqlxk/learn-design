package com.lql.definition_springIOC.framework.bean.support;

import com.lql.definition_springIOC.framework.bean.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: SimpleBeanDefinitionRegistry <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 16:29 <br>
 */
public class SimpleBeanDefinitionRegistry implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> map = new HashMap<>();

    @Override
    public BeanDefinitionRegistry registry(String name, BeanDefinition beanDefinition) {
        this.map.put(name, beanDefinition);

        return this;
    }

    @Override
    public BeanDefinition getBeanDefiniton(String name) {
        return this.map.get(name);
    }

    @Override
    public void removeRegistry(String name) {
        this.map.remove(name);
    }

    @Override
    public boolean containBeanDefiniton(String name) {
        return this.map.containsKey(name);
    }

    @Override
    public int getBeanDefinitionCount() {
        return this.map.size();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return this.map.keySet().toArray(new String[0]);
    }
}
