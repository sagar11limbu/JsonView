package com.infodev.controllers;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.infodev.entities.Trading_Data;
import com.infodev.models.OhlcRequest;
import com.infodev.models.OhlcResponse;
import com.infodev.services.BankServices;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by reddevil on 2/12/2017.
 */

@Controller
public class BankController {

    @Autowired
    BankServices bankServices;


//    @JsonView(View.Summary.class)
//    @RequestMapping(value = "/getohlc", method = RequestMethod.POST)
//    public @ResponseBody List<Trading_Data> getOhlc(@RequestBody OhlcRequest ohlcRequest) {
//        List<Trading_Data> l =bankServices.getOhlc(ohlcRequest);
//        return  l;
//    }
    @RequestMapping(value = "/getohlcall", method = RequestMethod.POST)
    public @ResponseBody TreeMap<String, Long> getOhlcAll(@RequestBody OhlcRequest ohlcRequest) {
        List<Trading_Data> list = bankServices.getOhlc(ohlcRequest);
        TreeMap<String,Long> returnList = new TreeMap<String, Long>();
        if(list != null){
            for(Trading_Data tdata: list){
                returnList.put("closingPrice",tdata.getClosingPrice());
                returnList.put("maxPrice",tdata.getMaxPrice());
                returnList.put("minPrice",tdata.getMinPrice());
                returnList.put("prevClosing",tdata.getPrevClosing());

            }
        }
        return returnList;
    }

}
