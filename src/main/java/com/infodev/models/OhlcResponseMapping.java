package com.infodev.models;

/**
 * Created by reddevil on 2/13/2017.
 */
public class OhlcResponseMapping {

    private long maxPrice;

    private long minPrice;

    private long prevClosing;

    private long closingPrice;

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

    public long getPrevClosing() {
        return prevClosing;
    }

    public void setPrevClosing(long prevClosing) {
        this.prevClosing = prevClosing;
    }

    public long getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(long closingPrice) {
        this.closingPrice = closingPrice;
    }

    public OhlcResponseMapping(){

    }
}
