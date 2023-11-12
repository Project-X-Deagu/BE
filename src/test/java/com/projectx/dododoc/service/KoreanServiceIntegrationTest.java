package com.projectx.dododoc.service;

import com.projectx.dododoc.domain.English;
import com.projectx.dododoc.domain.Korean;
import com.projectx.dododoc.repository.EnglishRepository;
import com.projectx.dododoc.repository.KoreanRepository;
import com.projectx.dododoc.repository.KoreanSentenceRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@SpringBootTest
@Transactional
public class KoreanServiceIntegrationTest {

    KoreanService korService;
    KoreanSentenceRepository korRepository;

    @BeforeEach
    public void beforeEach() {
        korRepository = new KoreanSentenceRepository();
        korService = new KoreanService(korRepository);
    }

    @Test
    void 문장삽입() {
        Korean kor = new Korean();
        kor.setSentence("System.out.println");

        long saveId = korService.join(kor);

        Korean tmp = korRepository.findById(saveId).get();
        Assertions.assertThat(kor).isEqualTo(tmp);
    }

}
