package com.example.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.Dto.DoctorDto;
import com.example.hospital.Service.DoctorService;

@RestController
public class DoctorController {
@Autowired
DoctorService doctorService;

	@GetMapping("/hospitals/{hospitalId}/doctors")
	public List<DoctorDto> getDoctorByhospitalId(@PathVariable int hospitalId)
	{
	    return doctorService.getDoctorByhospitalId(hospitalId);
	    
	}
	 @GetMapping("/doctors/specialisation")
	    public List<DoctorDto> getDoctorsByspecialisation(@RequestParam("specialisation")String specialisation)
	    {
	        return doctorService.getDoctorsByspecialisation(specialisation);
	    }
}
