package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Institute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituteRepository extends JpaRepository<Institute,Integer> {
}
