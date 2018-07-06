package com.msp.controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class MspController {
     
    @RequestMapping("/msp")
    public String sayHello() {
        return "<h1>This is MSP- java - springboot application<<h1>";
    }
 
}