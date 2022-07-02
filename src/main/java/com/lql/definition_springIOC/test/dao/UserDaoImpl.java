package com.lql.definition_springIOC.test.dao;

/**
 * Title: UserDaoImpl <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 16:45 <br>
 */
public class UserDaoImpl implements UserDao{

    public UserDaoImpl() {
        System.out.println("UserDaoImpl已创建.....");
    }

    @Override
    public void select() {
        System.out.println("UserDaoImpl.....");
    }
}
