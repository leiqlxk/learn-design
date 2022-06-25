package com.lql.creator.factory.simpleConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Title: SimpleConfigFactory <br>
 * ProjectName: learn-design <br>
 * description: 普通工厂+配置文件的形式可以使客户端和具体产品类完全解耦 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 21:58 <br>
 */
public class SimpleConfigFactory {

    private static Map<String, Coffee> map = new HashMap<>();

    static {
        InputStream in = SimpleConfigFactory.class.getClassLoader().getResourceAsStream("bean.properties");

        Properties properties = new Properties();
        try {
            properties.load(in);
            Set<Object> objects = properties.keySet();

            for (Object object : objects) {
                String className = properties.getProperty((String)object);
                Class<?> aClass = Class.forName(className);
                Coffee coffee = (Coffee) aClass.newInstance();
                map.put((String) object, coffee);
            }
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public static Coffee createCoffe(String name) {
        return map.get(name);
    }

}
