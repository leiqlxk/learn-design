package com.lql.definition_springIOC.framework.context.support;

/**
 * Title: SpringUtils <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 17:17 <br>
 */
public class SpringUtils {

    public static String getMethodName(String name) {
        return "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
