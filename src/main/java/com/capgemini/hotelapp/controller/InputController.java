package com.capgemini.hotelapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;

/**
 * Created by EHEIJDEN en SAKUNNEN on 4-5-2017.
 */
@RestController
public class InputController {
    @RequestMapping(value = "/api/page", method = RequestMethod.POST)
    public Result result() {
        Result result = new Result ("The answer to the Universe!");
        return result;
    }
}
