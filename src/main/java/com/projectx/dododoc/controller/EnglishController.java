package com.projectx.dododoc.controller;

import com.projectx.dododoc.service.EnglishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class EnglishController {

    private final EnglishService engService;

    @Autowired
    public EnglishController(EnglishService engService) {
        this.engService = engService;
    }
}
