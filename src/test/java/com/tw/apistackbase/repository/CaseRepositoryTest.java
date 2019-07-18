package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Case;
import com.tw.apistackbase.model.CriminalInformation;
import com.tw.apistackbase.model.Institute;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class CaseRepositoryTest {
    @Autowired
    CaseRepository caseRepository;

    @Test
    public void should_return_cases_order_by_time_desc() {
        Case case1 = new Case();
        case1.setCaseName("one kill one");
        case1.setCaseTime(20190718);
        case1.setCriminalInformation(new CriminalInformation("one", "one"));
        case1.setInstitute(new Institute("ZHA Institute"));
        Case case2 = new Case();
        case2.setCaseName("two kill two");
        case2.setCaseTime(20190707);
        case2.setCriminalInformation(new CriminalInformation("two", "two"));
        case2.setInstitute(new Institute("ZHA Institutes"));
        caseRepository.save(case1);
        caseRepository.save(case2);
        List<Case> cases = caseRepository.findAllByOrderByCaseTimeDesc();
        assertThat(cases.get(0).getCaseName()).isEqualTo("one kill one");
    }


}