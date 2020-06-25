package com.example.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.Dto.HospitalAddressDto;
import com.example.hospital.Dto.HospitalDto;
import com.example.hospital.Service.HospitalService;

@RestController
public class HospitalController {
	@Autowired
    HospitalService hospitalService;



    @GetMapping("/hospitals")
    public Iterable<HospitalDto> getAllHospitals() {
        return hospitalService.getAllHospitals();



    }
    /*@GetMapping("/hospitals/{hospitalId}")
    public HospitalDto getHospitalById(@PathVariable int hospitalId)
    {
        return hospitalService.getHospitalById(hospitalId);
        
    }*/
    @GetMapping("/hospitals/hospitalName")
    public List<HospitalDto> getHospitalsByhospitalName(@RequestParam("hospitalName")String hospitalName)
    {
        return hospitalService.getHospitalByName(hospitalName);
    }
    @GetMapping("/hospitals/address")
    public List<HospitalAddressDto> getHospitalsByaddress(@RequestParam("address")String address)
    {
        return hospitalService.getHospitalByaddress(address);
    }
}
