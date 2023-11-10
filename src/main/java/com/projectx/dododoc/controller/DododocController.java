package com.projectx.dododoc.controller;

// src/main/java/com.demogroup.demoweb/Controller/HelloWorldController.java

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class DododocController {

    @GetMapping("/api/hello")
    public String test() {
        return "Hello, world!";
    }
}