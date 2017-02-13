package com.infodev.dao;

import com.infodev.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by reddevil on 2/12/2017.
 */

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    //hibernate session different from HTTP session
    private Session session;
    //hibernate transaction
    private Transaction trans;

    public User save(User user) {
        session=sessionFactory.openSession();
        trans=session.beginTransaction();
        session.save(user); //saves the user
        trans.commit();
        session.close();
        return user;

    }
}
