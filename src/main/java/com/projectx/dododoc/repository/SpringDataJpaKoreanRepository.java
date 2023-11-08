package com.projectx.dododoc.repository;

import com.projectx.dododoc.domain.Korean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaKoreanRepository extends JpaRepository<Korean, Long>, KoreanRepository {

    @Override
    Optional<Korean> findBySentence(String sentence);
}
