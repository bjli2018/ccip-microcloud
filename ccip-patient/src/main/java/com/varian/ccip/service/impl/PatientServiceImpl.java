package com.varian.ccip.service.impl;

import com.varian.ccip.dao.entity.Patient;
import com.varian.ccip.dao.mapper.PatientMapper;
import com.varian.ccip.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements IPatientService {
    @Autowired
    private PatientMapper patientMapper;

    @Override
    public Patient get(long id) {
        return this.patientMapper.selectById(id);
    }
}
