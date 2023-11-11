package com.projectx.dododoc.repository;

import com.projectx.dododoc.domain.English;
import com.projectx.dododoc.domain.Korean;

import java.util.*;

public class EnglishSentenceRepository implements EnglishRepository {

    private static Map<Long, English> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public English save(English eng) {
        eng.setId(++sequence);
        store.put(eng.getId(), eng);
        return eng;
    }

    @Override
    public Optional<English> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<English> findByLang(String lang) {
        return store.values().stream()
                .filter(eng -> eng.getLang().equals(lang))
                .findAny();
    }

    @Override
    public List<English> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<English> findBySentence(String sen) {
        return store.values().stream()
                .filter(kor -> kor.getSentence().equals(sen))
                .findAny();
    }
}
