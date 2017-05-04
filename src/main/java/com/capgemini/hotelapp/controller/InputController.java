package com.capgemini.hotelapp.controller;

import com.capgemini.hotelapp.model.Input;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by EHEIJDEN en SAKUNNEN on 4-5-2017.
 */
@RestController
public class InputController {
    @RequestMapping(value = "/api/page", method = RequestMethod.POST)
    public String banaan(@RequestBody Input appel) {
        if (appel.getTekst().equals("42")) {
            String result = new String("The answer to the Universe!");
            return result;
        }
        return null;
    }
}
