package com.example.firstspringbootwithswaggerapp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/accounts")
public class AccountsController {


    @RequestMapping(method = RequestMethod.GET,path = "/bill/{id}/{name}")
    public String getBills(){

        return "Hello Swagger";
    }


}
