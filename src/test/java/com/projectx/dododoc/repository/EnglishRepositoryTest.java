package com.projectx.dododoc.repository;

import com.projectx.dododoc.domain.English;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnglishRepositoryTest {

    EnglishRepository engRepository = new EnglishRepository();

    @AfterEach
    public void afterEach() {
        engRepository.clearStore();
    }

    @Test
    void save() {
        English eng = new English();
        eng.setSentence("Hello!");

        engRepository.save(eng);


    }
    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void clearStore() {
    }
}