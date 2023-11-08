package com.projectx.dododoc.repository;

import com.projectx.dododoc.domain.English;
import com.projectx.dododoc.domain.Korean;

import java.util.*;

public interface EnglishRepository {

    English save(English eng);

    Optional<English> findById(Long id);

    Optional<English> findByLang(String lang);

    Optional<English> findBySentence(String sentence);

    List<English> findAll();

}
