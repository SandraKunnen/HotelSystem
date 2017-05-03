package com.capgemini.hotelapp.controller;

import com.capgemini.hotelapp.model.Person;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

/**
 * Created by SAKUNNEN on 3-5-2017.
 */

@RestController
public class PersonController {

    @RequestMapping(value = "/api/person", method = RequestMethod.GET)
    public Person getPerson (@RequestParam String name, @RequestParam int age){
        Person p = new Person();
        p.setName(name);
        p.setAge(age);
        return p;
    }
     @RequestMapping(value= "api/person", method = RequestMethod.POST)
    public Person postPerson(Person p) {
        p.setName("Zijn naam is: " + p.getName());
        return p;
     }

}