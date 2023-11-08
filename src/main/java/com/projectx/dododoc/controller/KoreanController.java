package com.projectx.dododoc.controller;

import com.projectx.dododoc.service.KoreanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class KoreanController {

    private final KoreanService korService;

    @Autowired
    public KoreanController(KoreanService korService) {
        this.korService = korService;
    }
}
