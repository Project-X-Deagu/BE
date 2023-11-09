package com.projectx.dododoc.service;

import com.projectx.dododoc.domain.English;
import com.projectx.dododoc.domain.Korean;
import com.projectx.dododoc.repository.EnglishRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
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

    @Test
    @Commit
    void JAVA_insert() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("/Users/jiwon/Downloads/java_db.txt"));
        for (int i = 0; i < lines.size(); i++) {
            English eng = new English();
            eng.setSentence(lines.get(i));
            eng.setLang("JAVA");

            engService.join(eng);
        }
    }

    @Test
    @Commit
    void PYTHON_insert() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("/Users/jiwon/Downloads/python_db.txt"));
        for (int i = 0; i < lines.size(); i++) {
            English eng = new English();
            eng.setSentence(lines.get(i));
            eng.setLang("PYTHON");

            engService.join(eng);
        }
    }

    @Test
    @Commit
    void C_insert() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("/Users/jiwon/Downloads/c_db.txt"));
        for (int i = 0; i < lines.size(); i++) {
            English eng = new English();
            eng.setSentence(lines.get(i));
            eng.setLang("C");

            engService.join(eng);
        }
    }
}
