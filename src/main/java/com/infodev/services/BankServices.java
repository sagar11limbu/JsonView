package com.infodev.services;

import com.infodev.entities.Trading_Data;
import com.infodev.models.OhlcRequest;
import com.infodev.models.OhlcResponseMapping;

import java.util.List;

/**
 * Created by reddevil on 2/12/2017.
 */
public interface BankServices {
    public List<Trading_Data> getOhlc(OhlcRequest ohlcRequest);

}
