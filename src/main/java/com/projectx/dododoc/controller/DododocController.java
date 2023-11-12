package com.projectx.dododoc.controller;

// src/main/java/com.demogroup.demoweb/Controller/HelloWorldController.java

import com.projectx.dododoc.domain.English;
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

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
    @GetMapping("/")
    public void home() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("/Users/jiwon/Downloads/korean_db.txt"));
        for (int i = 0; i < lines.size(); i++) {
            Korean kor = new Korean();
            kor.setSentence(lines.get(i));

            korService.join(kor);
        }

        List<String> lines1 = Files.readAllLines(Paths.get("/Users/jiwon/Downloads/java_db.txt"));
        for (int i = 0; i < lines1.size(); i++) {
            English eng = new English();
            eng.setSentence(lines1.get(i));
            eng.setLang("JAVA");

            engService.join(eng);
        }

        List<String> lines2 = Files.readAllLines(Paths.get("/Users/jiwon/Downloads/python_db.txt"));
        for (int i = 0; i < lines2.size(); i++) {
            English eng = new English();
            eng.setSentence(lines2.get(i));
            eng.setLang("PYTHON");

            engService.join(eng);
        }

        List<String> lines3 = Files.readAllLines(Paths.get("/Users/jiwon/Downloads/c_db.txt"));
        for (int i = 0; i < lines3.size(); i++) {
            English eng = new English();
            eng.setSentence(lines3.get(i));
            eng.setLang("C");

            engService.join(eng);
        }
    }

    @GetMapping("/api/korean")
    public List<Korean> Kor_sentence(Model model) {
        List<Korean> kor_sen = korService.findSentences();
        return kor_sen;
    }

    @GetMapping("/api/English")
    public List<English> Eng_sentence(Model model) {
        List<English> eng_sen = engService.findSentences();
        return eng_sen;
    }
}