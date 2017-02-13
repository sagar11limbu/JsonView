package com.infodev.services;

import com.infodev.dao.BankDao;
import com.infodev.entities.Trading_Data;
import com.infodev.models.OhlcRequest;
import com.infodev.models.OhlcResponseMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by reddevil on 2/12/2017.
 */

@Service
public class BankServicesImpl implements BankServices{

    @Autowired
    private BankDao bankDao;

    @Transactional
    public List<Trading_Data> getOhlc(OhlcRequest ohlcRequest){
        return this.bankDao.getOhlc(ohlcRequest);
    }

}
