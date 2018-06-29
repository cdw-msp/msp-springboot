package com.msp.controller;
// this is sample comment 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class MspController {
     
    @RequestMapping("/msp")
    public String sayHello() {
        return "This is our sample java - spring boot application";
    }
 
}