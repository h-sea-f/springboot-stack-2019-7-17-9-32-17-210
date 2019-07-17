package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Ombudsman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OmbudsmanRepository extends JpaRepository<Ombudsman,Integer> {
    Ombudsman findById(int id);
}
