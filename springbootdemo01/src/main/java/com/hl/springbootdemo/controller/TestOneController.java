package com.hl.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestOneController {
    @RequestMapping("/msgß")
    public String getMsg(){
        return "test One";
    }
}
