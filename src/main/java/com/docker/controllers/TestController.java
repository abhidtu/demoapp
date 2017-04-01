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
public class TestController {

	@RequestMapping(value = "/health", method = RequestMethod.GET)
    public ResponseEntity<String> testHealth(){
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

	@RequestMapping(value = "/api/v1/dockerapi", method = RequestMethod.GET)
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("hello via spring docker", HttpStatus.OK);
    }

}
