package com.projectx.dododoc.repository;

import com.projectx.dododoc.domain.Korean;

import java.util.*;

public class KoreanSentenceRepository implements KoreanRepository {

    private static Map<Long, Korean> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Korean save(Korean kor) {
        kor.setId(++sequence);
        store.put(kor.getId(), kor);
        return kor;
    }

    @Override
    public Optional<Korean> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Korean> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Korean> findBySentence(String sen) {
        return store.values().stream()
                .filter(kor -> kor.getSentence().equals(sen))
                .findAny();
    }
}
