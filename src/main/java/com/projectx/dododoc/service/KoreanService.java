package com.projectx.dododoc.service;

import com.projectx.dododoc.domain.Korean;
import com.projectx.dododoc.repository.KoreanRepository;

import java.util.List;
import java.util.Optional;

public class KoreanService {
    private final KoreanRepository korRepository;

    public KoreanService(KoreanRepository korRepository) {
        this.korRepository = korRepository;
    }

    /**
     * 문장 넣기
     */

    public long join(Korean kor) {
        korRepository.save(kor);
        return kor.getId();
    }

    /**
     * 전체 문장 조회
     */

    public List<Korean> findSentences() {
        return korRepository.findAll();
    }

    public Optional<Korean> findOne(long id) {
        return korRepository.findById(id);
    }
}
