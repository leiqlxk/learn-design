package com.lql.definition_springIOC.framework.context;

import com.lql.definition_springIOC.framework.bean.BeanDefinition;
import com.lql.definition_springIOC.framework.bean.support.BeanDefinitionReader;
import com.lql.definition_springIOC.framework.bean.support.BeanDefinitionRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: AbstractApplicationContext <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 17:02 <br>
 */
public abstract class AbstractApplicationContext implements ApplicationContext{
    protected final Map<String, Object> map = new HashMap<>();
    protected BeanDefinitionReader beanDefinitionReader;

    protected String path;

    @Override
    public void refresh() throws Exception {
        beanDefinitionReader.loadBeanDefinitions(path);

        finishInitialization();
    }

    private void finishInitialization() throws Exception{
        BeanDefinitionRegistry registry = this.beanDefinitionReader.getRegistry();
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String definitionName : beanDefinitionNames) {
//            BeanDefinition beanDefiniton = registry.getBeanDefiniton(definitionName);
            getBean(definitionName);
        }
    }
}
