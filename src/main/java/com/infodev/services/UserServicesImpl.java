package com.infodev.services;

import com.infodev.dao.UserDao;
import com.infodev.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by reddevil on 2/12/2017.
 */

@Service
public class UserServicesImpl implements UserServices{

    @Autowired
    private UserDao userDao;

    @Transactional
    public User save(User user){
        return  this.userDao.save(user);

    }
}
