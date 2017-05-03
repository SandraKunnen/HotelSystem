package com.capgemini.hotelapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SAKUNNEN on 2-5-2017.
 */

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return ("Hello World");
    }

}

