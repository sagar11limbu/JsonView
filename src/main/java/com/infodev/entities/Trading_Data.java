package com.infodev.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.infodev.models.View;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by reddevil on 2/12/2017.
 */

@Entity
@Table
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Trading_Data  {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String stockCode;

    @Column
    private long maxPrice;

    @Column
    private long minPrice;

    @Column
    private long closingPrice;

    @Column
    private long prevClosing;

    @Column
    @JsonView(View.Summary.class)
    private String eDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

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

    public String geteDate() {
        return eDate;
    }

    public void seteDate(String eDate) {
        this.eDate = eDate;
    }
}
