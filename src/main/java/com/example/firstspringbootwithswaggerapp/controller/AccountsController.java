package com.example.firstspringbootwithswaggerapp.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/accounts")
@Api(value = "AccountsInformation")
public class AccountsController {


    @RequestMapping(method = RequestMethod.GET,path = "/bill/{id}/{name}")
    @ApiOperation(value = "Fetches the bill details for the given id and name",response = String.class)
     public String getBills(@PathVariable("id")String id,@PathVariable("name")String name){

        return "Hey "+name+" your bill for the id: "+id+" is "+0.0;
    }


}
