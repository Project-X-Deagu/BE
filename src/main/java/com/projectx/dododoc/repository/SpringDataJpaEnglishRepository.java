package com.projectx.dododoc.repository;

import com.projectx.dododoc.domain.English;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaEnglishRepository extends JpaRepository<English, Long>, EnglishRepository{

    @Override
    Optional<English> findByLang(String lang);
    @Override
    Optional<English> findBySentence(String sentence);
}
