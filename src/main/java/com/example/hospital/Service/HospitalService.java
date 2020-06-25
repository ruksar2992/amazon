package com.example.hospital.Service;

import java.util.List;

import com.example.hospital.Dto.HospitalAddressDto;
import com.example.hospital.Dto.HospitalDto;

public interface HospitalService {

	  List<HospitalDto> getHospitalByName(String hospitalName);

	  Iterable<HospitalDto> getAllHospitals();
	  
	  HospitalDto getHospitalById(int hospitalId);

	List<HospitalAddressDto> getHospitalByaddress(String address);

}


