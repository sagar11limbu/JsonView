package com.infodev.dao;

import com.infodev.entities.Trading_Data;
import com.infodev.models.OhlcRequest;
import com.infodev.models.OhlcResponse;
import org.hibernate.*;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
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
//        Criteria cr = session.createCriteria(Trading_Data.class)
//                .setProjection(Projections.projectionList()
//                        .add(Projections.property("minPrice"), "minPrice")
//                        .add(Projections.property("maxPrice"), "maxPrice")
//                        .add(Projections.property("closingPrice"), "closingPrice")
//                        .add(Projections.property("prevClosing"), "prevClosing"))
//                .setResultTransformer(Transformers.aliasToBean(Trading_Data.class));
//
//        List<Trading_Data> list = cr.list();
        Query query = session.createQuery("from Trading_Data t where t.stockCode=:stockCode");
        query.setParameter("stockCode",ohlcRequest.getStockCode());
        List list = query.list();
        return list;

    }

}
