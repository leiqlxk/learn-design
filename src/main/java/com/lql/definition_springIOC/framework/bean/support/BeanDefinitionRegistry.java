package com.lql.definition_springIOC.framework.bean.support;

import com.lql.definition_springIOC.framework.bean.BeanDefinition;

/**
 * Title: BeanDefinitionRegistry <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 16:26 <br>
 */
public interface BeanDefinitionRegistry {

    BeanDefinitionRegistry registry(String name, BeanDefinition beanDefinition);

    BeanDefinition getBeanDefiniton(String name);

    void  removeRegistry(String name);

    boolean containBeanDefiniton(String name);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();
}
