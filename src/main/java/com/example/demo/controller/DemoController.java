package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/test")
    public String test(){
        System.out.println("테스트 코드");
        return "test.html";
    }
}