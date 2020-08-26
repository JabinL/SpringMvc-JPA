package com.oocl.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWord {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello word";
    }
}
