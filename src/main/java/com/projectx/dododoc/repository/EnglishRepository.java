package com.projectx.dododoc.repository;

import com.projectx.dododoc.domain.English;

import java.util.*;

public class EnglishRepository {

    private static Map<Long, English> store = new HashMap<>();
    private static long sequence = 0L;

    public English save(English eng) {
        eng.setId(++sequence);
        store.put(eng.getId(), eng);
        return eng;
    }

    public Optional<English> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    public List<English> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
