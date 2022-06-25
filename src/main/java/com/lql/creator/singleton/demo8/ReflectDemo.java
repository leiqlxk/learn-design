package com.lql.creator.singleton.demo8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Title: ReflectDemo <br>
 * ProjectName: learn-design <br>
 * description: 反射也可以破坏除枚举以外的单例模式 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 20:28 <br>
 */
public class ReflectDemo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<StaticInnerClassSingleton> singletonClass = StaticInnerClassSingleton.class;

        Constructor<StaticInnerClassSingleton> declaredConstructor = singletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        System.out.println(declaredConstructor.newInstance() == declaredConstructor.newInstance());
    }
}
