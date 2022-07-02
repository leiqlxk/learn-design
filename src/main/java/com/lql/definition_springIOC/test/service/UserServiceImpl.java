package com.lql.definition_springIOC.test.service;

import com.lql.definition_springIOC.test.dao.UserDao;

/**
 * Title: UserServiceImpl <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/7/2 16:46 <br>
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
        System.out.println("UserServiceImpl已创建.....");
    }

    @Override
    public void select() {
        System.out.println("UserServiceImpl.....");
        userDao.select();
    }
}
