package com.capgemini.hotelapp.controller;

import com.capgemini.hotelapp.model.BoekingsRegister;
import com.capgemini.hotelapp.model.Gast;
import com.capgemini.hotelapp.model.Page;
import com.capgemini.hotelapp.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class PageController {

    @RequestMapping(value = "/api/page", method = RequestMethod.GET)
    public Gast getPage (){
        BoekingsRegister boekingsRegister = new BoekingsRegister();
        return boekingsRegister.getEersteGast();
    }

    @RequestMapping(value = "/api/guests", method = RequestMethod.GET)
    public ArrayList getGuests(){
        BoekingsRegister b = new BoekingsRegister();
        return b.getGastenLijst();
    }
}
