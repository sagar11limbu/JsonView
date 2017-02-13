package com.infodev.models;

import com.infodev.entities.Trading_Data;

import java.util.List;

/**
 * Created by reddevil on 2/12/2017.
 */
public class OhlcResponse {

        List<OhlcResponseMapping> ohlcResponses;

        public List<OhlcResponseMapping> getOhlcResponses() {
            return ohlcResponses;
        }

        public void setOhlcResponses(List<OhlcResponseMapping> ohlcResponses) {
            this.ohlcResponses = ohlcResponses;
        }


}
