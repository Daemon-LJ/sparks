package com.demo.sparks.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping({"/"})
    public String helloWord(){
        return "hello World" ;
    }

}
