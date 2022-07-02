package com.lql.definition_springIOC.framework.context;

import com.lql.definition_springIOC.framework.bean.BeanDefinition;
import com.lql.definition_springIOC.framework.bean.MutablePropertyValue;
import com.lql.definition_springIOC.framework.bean.PropertyValue;
import com.lql.definition_springIOC.framework.bean.support.BeanDefinitionReader;
import com.lql.definition_springIOC.framework.bean.support.BeanDefinitionRegistry;
import com.lql.definition_springIOC.framework.bean.xml.XmlBeanDefinitionReader;
import com.lql.definition_springIOC.framework.context.support.SpringUtils;

import java.lang.reflect.Method;

/**
 * Title: ClassPathXmlApplication <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 17:00 <br>
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    public ClassPathXmlApplicationContext(String path) {
        super.path = path;
        super.beanDefinitionReader = new XmlBeanDefinitionReader();

        try {
            super.refresh();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object getBean(String name) throws Exception{
        Object o = super.map.get(name);
        if (o != null) {
            return o;
        }

        BeanDefinitionRegistry registry = super.beanDefinitionReader.getRegistry();
        BeanDefinition beanDefiniton = registry.getBeanDefiniton(name);

        if (beanDefiniton == null) {
            return null;
        }

        Class aClass = Class.forName(beanDefiniton.getClassName());
        Object obj = aClass.newInstance();
        MutablePropertyValue mutablePropertyValue = beanDefiniton.getMutablePropertyValue();
        for (PropertyValue propertyValue : mutablePropertyValue) {
            String name1 = propertyValue.getName();
            String methodName = SpringUtils.getMethodName(name1);

            String ref = propertyValue.getRef();
            if (ref != null && !ref.equals("")) {
                Object bean = getBean(ref);
                Method[] methods = aClass.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.getName().equals(methodName)) {
                        method.invoke(obj, bean);
                    }
                }
            }

            String value = propertyValue.getValue();
            if (value != null && !value.equals("")) {
                Method method = aClass.getMethod(methodName, String.class);
                method.invoke(obj, value);
            }

        }

        super.map.put(name, obj);
        return obj;
    }

    @Override
    public <T> T getBean(String name, Class<T> clazz) throws Exception{
        Object bean = getBean(name);

        return bean == null ? null : clazz.cast(bean);
    }
}
