package com.infodev.controllers;

import com.infodev.entities.User;
import com.infodev.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

/**
 * Created by reddevil on 2/12/2017.
 */

@Controller
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class.getName());

    @Autowired
    UserServices userServices;
    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public @ResponseBody User save(@RequestBody User u) {
        userServices.save(u);
        return u;
    }



}
