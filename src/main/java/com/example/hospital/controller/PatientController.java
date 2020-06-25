package com.example.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.Dto.PatientDto;
import com.example.hospital.Service.PatientService;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;
    
    @PostMapping("/patients")
    public String registerBypatient(@RequestBody PatientDto patientdto) {
        patientService.savepatientdetails(patientdto);
        return "Patient has successfully registered ";
    }
    
	}
	
	

