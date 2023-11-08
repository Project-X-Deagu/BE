package com.projectx.dododoc.service;


import com.projectx.dododoc.domain.Korean;
import com.projectx.dododoc.repository.EnglishRepository;
import com.projectx.dododoc.repository.KoreanRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final EnglishRepository engRepository;
    private final KoreanRepository korRepository;
    public SpringConfig(EnglishRepository engRepository, KoreanRepository korRepository) {
        this.engRepository = engRepository;
        this.korRepository = korRepository;
    }

    @Bean
    public EnglishService englishService() {
        return new EnglishService(engRepository);
    }

    @Bean
    public KoreanService koreanService() {
        return new KoreanService(korRepository);
    }
}
