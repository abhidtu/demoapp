package com.docker.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by linux on 29/11/16.
 */
@Controller
@RequestMapping(value = "/api/v1/dockerapi")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> test(){

    	System.out.println("hello via spring docker");

        return new ResponseEntity<>("hello via spring docker", HttpStatus.OK);
    }

}
