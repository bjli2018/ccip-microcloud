package com.varian.ccip.patient;

import com.varian.ccip.PatientApp;
import com.varian.ccip.dao.entity.Patient;
import com.varian.ccip.dao.mapper.PatientMapper;
import com.varian.ccip.service.IPatientService;
import com.varian.ccip.service.impl.PatientServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {PatientApp.class})
public class PatientServiceTest {

    @Autowired
    private IPatientService iPatientService;


	@Test
	public void testGetById() {
		Patient patient = iPatientService.get(1);
        System.out.println(patient);
	}
}
