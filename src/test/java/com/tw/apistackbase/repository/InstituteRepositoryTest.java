package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Institute;
import com.tw.apistackbase.model.Ombudsman;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;


@DataJpaTest
@ExtendWith(SpringExtension.class)
public class InstituteRepositoryTest {
    @Autowired
    InstituteRepository instituteRepository;

    @Test
    public void should_save_and_find_institute() {
        Institute institute = new Institute();
        institute.setName("ZHA Institute");
        instituteRepository.save(institute);
        Institute fetchedInstitute = instituteRepository.findById(institute.getId()).get();
        assertThat(fetchedInstitute.getName()).isEqualTo("ZHA Institute");
    }

    @Test
    public void should_return_relate_ombudsman_when_find_institute(){
        Institute institute = new Institute();
        institute.setName("ZHA Institute");
        List<Ombudsman> ombudsmanList = new ArrayList<>(Arrays.asList(new Ombudsman("Sean"),new Ombudsman("Sean1")));
        institute.setOmbudsmans(ombudsmanList);
        instituteRepository.save(institute);
        Institute fetchedInstitute = instituteRepository.findById(institute.getId()).get();
        assertThat(fetchedInstitute.getName()).isEqualTo("ZHA Institute");
        assertThat(fetchedInstitute.getOmbudsmans().get(0).getName()).isEqualTo("Sean");
        assertThat(fetchedInstitute.getOmbudsmans().get(1).getName()).isEqualTo("Sean1");
    }

}
