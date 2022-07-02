package com.lql.definition_springIOC.framework.bean.support;

/**
 * Title: BeanFactory <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 16:59 <br>
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;

    <T> T getBean(String name, Class<T> clazz) throws Exception;
}
