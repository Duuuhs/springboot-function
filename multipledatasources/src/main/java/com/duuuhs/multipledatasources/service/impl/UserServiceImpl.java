package com.duuuhs.multipledatasources.service.impl;

import com.duuuhs.multipledatasources.dao.BaseDao;
import com.duuuhs.multipledatasources.dao.master.UserDao;
import com.duuuhs.multipledatasources.model.User;
import com.duuuhs.multipledatasources.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Duuuhs
 * @description
 * @create 2020/4/29 23:18
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User>  implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    protected BaseDao<User> getMapper() {
        return this.userDao;
    }

}
