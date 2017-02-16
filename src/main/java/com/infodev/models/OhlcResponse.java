package com.infodev.models;


import java.io.Serializable;

/**
 * Created by reddevil on 2/15/2017.
 */
public class OhlcResponse implements Serializable{
    private static final long serialVersionUID = 1L;

    private long maxPrice;

    private long minPrice;

    private long closingPrice;

    private long prevClosing;

    public long getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(long maxPrice) {
        this.maxPrice = maxPrice;
    }

    public long getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(long minPrice) {
        this.minPrice = minPrice;
    }

    public long getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(long closingPrice) {
        this.closingPrice = closingPrice;
    }

    public long getPrevClosing() {
        return prevClosing;
    }

    public void setPrevClosing(long prevClosing) {
        this.prevClosing = prevClosing;
    }
}
