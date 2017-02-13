package com.infodev.dao;

import com.infodev.entities.Trading_Data;
import com.infodev.models.OhlcRequest;
import com.infodev.models.OhlcResponseMapping;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by reddevil on 2/12/2017.
 */

@Repository("bankDao")
public class BankDaoImpl implements BankDao{



    @Autowired
    SessionFactory sessionFactory;

    Session session;

    Transaction trans;

    public List<Trading_Data> getOhlc(OhlcRequest ohlcRequest){
        sessionFactory.openSession();
        session=sessionFactory.openSession();
        Query query=session.createQuery(" from Trading_Data t where t.stockCode=:stockCode");
        query.setParameter("stockCode",ohlcRequest.getStockCode());
        System.out.println(query);
        List list=query.list();
        session.close();
        return list;

    }

}
