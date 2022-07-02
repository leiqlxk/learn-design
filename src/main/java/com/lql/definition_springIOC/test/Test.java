package com.lql.definition_springIOC.test;

import com.lql.definition_springIOC.framework.context.ClassPathXmlApplicationContext;
import com.lql.definition_springIOC.test.service.UserService;

/**
 * Title: Test <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 17:25 <br>
 */
public class Test {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        userService.select();
    }
}
