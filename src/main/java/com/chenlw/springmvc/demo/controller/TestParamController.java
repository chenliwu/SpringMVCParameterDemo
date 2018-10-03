package com.chenlw.springmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/params")
public class TestParamController {

    @RequestMapping("/index")
    public String testParam1(){
        return "pages/testParam";
    }

}
