package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface CaseRepository extends JpaRepository<Case,Integer> {
    List<Case> findAllByOrderByCaseTimeDesc();
    List<Case> findByCaseName(String caseName);
    Case deleteById(int id);
}
