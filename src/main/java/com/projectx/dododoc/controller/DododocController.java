package com.projectx.dododoc.controller;

// src/main/java/com.demogroup.demoweb/Controller/HelloWorldController.java

import com.projectx.dododoc.domain.Korean;
import com.projectx.dododoc.repository.KoreanRepository;
import com.projectx.dododoc.service.EnglishService;
import com.projectx.dododoc.service.KoreanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Random;

@Controller
@ResponseBody
public class DododocController {
    private final KoreanService korService;
    private final EnglishService engService;
    int kor_seq, eng_seq;
    @Autowired
    public DododocController(KoreanService korService, EnglishService engService) {
        this.korService = korService;
        this.engService = engService;
    }

    @GetMapping("/api/Korean")
    public List<Korean> Kor_sentence(Model model) {
        List<Korean> kor = korService.findSentences();
        model.addAttribute("kor_sentence", kor);
        return kor;
    }
}