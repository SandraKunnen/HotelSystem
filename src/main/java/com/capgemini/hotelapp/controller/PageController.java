package com.capgemini.hotelapp.controller;

import com.capgemini.hotelapp.model.Page;
import com.capgemini.hotelapp.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PageController {

    @RequestMapping(value = "/api/page", method = RequestMethod.GET)
    public Page getPage (){
        Page p = new Page();
        p.setTitle("Hallo");
        p.setContent("Dit is de inhoud.");
        return p;
    }
}
