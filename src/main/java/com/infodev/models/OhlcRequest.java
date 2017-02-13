package com.infodev.models;

/**
 * Created by reddevil on 2/12/2017.
 */
public class OhlcRequest {
    private String StockCode;
    private String eDate;

    public OhlcRequest(){

    }

    public String getStockCode() {
        return StockCode;
    }

    public void setStockCode(String stockCode) {
        StockCode = stockCode;
    }

    public String geteDate() {
        return eDate;
    }

    public void seteDate(String eDate) {
        this.eDate = eDate;
    }
}
