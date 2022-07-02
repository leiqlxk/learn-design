package com.lql.definition_springIOC.framework.bean.xml;

import com.lql.definition_springIOC.framework.bean.BeanDefinition;
import com.lql.definition_springIOC.framework.bean.MutablePropertyValue;
import com.lql.definition_springIOC.framework.bean.PropertyValue;
import com.lql.definition_springIOC.framework.bean.support.BeanDefinitionReader;
import com.lql.definition_springIOC.framework.bean.support.BeanDefinitionRegistry;
import com.lql.definition_springIOC.framework.bean.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * Title: XmlBeanDefinitionReader <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 16:34 <br>
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        this.registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return this.registry;
    }

    @Override
    public void loadBeanDefinitions(String path) throws Exception {
        InputStream resourceAsStream = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(path);
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read(resourceAsStream);
        Element rootElement = read.getRootElement();

        parseBeanDefinition(rootElement);
    }

    private void parseBeanDefinition(Element rootElement) {
        List<Element> beans = rootElement.elements("bean");
        for (Element bean : beans) {
            String id = bean.attributeValue("id");
            String className = bean.attributeValue("class");

            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);

            MutablePropertyValue propertyValues = new MutablePropertyValue();
            List<Element> propertys = bean.elements("property");
            for (Element property : propertys) {
                String name = property.attributeValue("name");
                String ref = property.attributeValue("ref");
                String value = property.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue();
                propertyValue.setName(name);

                if (ref != null && !ref.equals("")) {
                    propertyValue.setRef(ref);
                }

                if (value != null && !value.equals("")) {
                    propertyValue.setValue(value);
                }

                propertyValues.add(propertyValue);
            }

            beanDefinition.setMutablePropertyValue(propertyValues);
            this.registry.registry(id, beanDefinition);
        }
    }
}
