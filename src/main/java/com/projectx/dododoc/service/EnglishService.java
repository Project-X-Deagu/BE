package com.projectx.dododoc.service;

import com.projectx.dododoc.domain.English;
import com.projectx.dododoc.repository.EnglishRepository;

import java.util.List;
import java.util.Optional;

public class EnglishService {

    private final EnglishRepository engRepository;

    public EnglishService(EnglishRepository engRepository) {
        this.engRepository = engRepository;
    }

    /**
     * 문장 넣기
     */

    public long join(English eng) {
        engRepository.save(eng);
        return eng.getId();
    }

    /**
     * 전체 문장 조회
     */

    public List<English> findSentences() {
        return engRepository.findAll();
    }

    public Optional<English> findOne(long id) {
        return engRepository.findById(id);
    }
}
