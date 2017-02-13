package com.infodev.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import com.infodev.entities.Trading_Data;
import com.infodev.models.OhlcRequest;
import com.infodev.models.OhlcResponse;
import com.infodev.models.OhlcResponseMapping;
import com.infodev.models.View;
import com.infodev.services.BankServices;
import org.apache.commons.collections.FastHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by reddevil on 2/12/2017.
 */

@Controller
public class BankController {

    @Autowired
    BankServices bankServices;


    @JsonView(View.Summary.class)
    @RequestMapping(value = "/getohlc", method = RequestMethod.POST)
    public @ResponseBody List<Trading_Data> getOhlc(@RequestBody OhlcRequest ohlcRequest) {
        List<Trading_Data> l =bankServices.getOhlc(ohlcRequest);
        return  l;
    }
    @RequestMapping(value = "/getohlcall", method = RequestMethod.POST)
    public @ResponseBody List<Trading_Data> getOhlcAll(@RequestBody OhlcRequest ohlcRequest) {
        List<Trading_Data> l =bankServices.getOhlc(ohlcRequest);
        return  l;
    }

}
