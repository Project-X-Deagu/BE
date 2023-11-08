package com.projectx.dododoc.repository;

import com.projectx.dododoc.domain.Korean;

import java.util.*;

public class KoreanRepository {
    private static Map<Long, Korean> store = new HashMap<>();
    private static long sequence = 0L;

    public Korean save(Korean kor) {
        kor.setId(++sequence);
        store.put(sequence, kor);
        return kor;
    }

    public Optional<Korean> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    public List<Korean> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
