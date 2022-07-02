package com.lql.definition_springIOC.framework.bean.support;

import org.dom4j.DocumentException;

/**
 * Title: BeanDefinitionReader <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 16:32 <br>
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    void loadBeanDefinitions(String path) throws Exception;
}
