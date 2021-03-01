package com.lql.creator.abfactory.rebuild.factory;

import com.lql.creator.abfactory.rebuild.utils.ClassLoaderUtils;
import org.springframework.util.ClassUtils;
import sun.misc.ClassLoaderUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Title: JDKInvocationHandler <br>
 * ProjectName: learn-design <br>
 * description: 抽象工厂实现类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/3/1 11:13 <br>
 */
public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
    }
}
