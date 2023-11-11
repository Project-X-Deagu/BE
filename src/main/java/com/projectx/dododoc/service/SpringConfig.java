package com.projectx.dododoc.service;


import com.projectx.dododoc.domain.Korean;
import com.projectx.dododoc.repository.EnglishRepository;
import com.projectx.dododoc.repository.EnglishSentenceRepository;
import com.projectx.dododoc.repository.KoreanRepository;
import com.projectx.dododoc.repository.KoreanSentenceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public EnglishRepository engRepository() {
        return new EnglishSentenceRepository();
    }

    @Bean
    public KoreanRepository korRepository() {
        return new KoreanSentenceRepository();
    }

    @Bean
    public EnglishService englishService() {
        return new EnglishService(engRepository());
    }

    @Bean
    public KoreanService koreanService() {
        return new KoreanService(korRepository());
    }
}
