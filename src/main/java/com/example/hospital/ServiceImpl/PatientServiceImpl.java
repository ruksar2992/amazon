package com.example.hospital.ServiceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospital.Dao.PatientDao;
import com.example.hospital.Dto.PatientDto;
import com.example.hospital.Service.PatientService;
import com.example.hospital.model.Patient;

@Service
public class PatientServiceImpl implements PatientService{
	@Autowired
	PatientDao patientDao;

	@Override
	public void savepatientdetails(PatientDto patientdto) {
	
	Patient patient = new Patient();
	BeanUtils.copyProperties(patientdto, patient);
	patientDao.save(patient);
}
}

