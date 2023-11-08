package com.projectx.dododoc.service;

import com.projectx.dododoc.domain.English;
import com.projectx.dododoc.repository.EnglishRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootTest
@Transactional
public class EnglishServiceIntegrationTest {

    @Autowired EnglishService engService;
    @Autowired
    EnglishRepository englishRepository;

    @Test
    void 문장삽입() {
        English eng = new English();
        eng.setSentence("System.out.println");
        eng.setLang("JAVA");

        long saveId = engService.join(eng);

        English tmp = englishRepository.findById(saveId).get();
        Assertions.assertThat(eng).isEqualTo(tmp);
    }
}
