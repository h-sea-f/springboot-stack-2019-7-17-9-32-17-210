package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.CriminalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CriminalInformationRepository extends JpaRepository<CriminalInformation,Integer> {
    CriminalInformation findById(int id);

}
