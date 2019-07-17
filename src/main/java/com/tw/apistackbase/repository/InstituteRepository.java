package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Institute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituteRepository extends JpaRepository<Institute,Integer> {
    Institute findById(int id);
}
