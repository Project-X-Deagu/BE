package com.projectx.dododoc.service;

import com.projectx.dododoc.domain.English;
import com.projectx.dododoc.domain.Korean;
import com.projectx.dododoc.repository.EnglishRepository;
import com.projectx.dododoc.repository.KoreanRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
public class KoreanServiceIntegrationTest {

    @Autowired KoreanService korService;
    @Autowired KoreanRepository korRepository;

    @Test
    void 문장삽입() {
        Korean kor = new Korean();
        kor.setSentence("System.out.println");

        long saveId = korService.join(kor);

        Korean tmp = korRepository.findById(saveId).get();
        Assertions.assertThat(kor).isEqualTo(tmp);
    }
}
