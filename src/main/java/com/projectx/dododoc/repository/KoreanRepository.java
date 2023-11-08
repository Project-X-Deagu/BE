package com.projectx.dododoc.repository;

import com.projectx.dododoc.domain.Korean;

import java.util.*;

public interface KoreanRepository {

    Korean save(Korean kor);

    Optional<Korean> findById(Long id);

    Optional<Korean> findBySentence(String sentence);

    List<Korean> findAll();
}
