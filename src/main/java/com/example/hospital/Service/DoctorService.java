package com.example.hospital.Service;

import java.util.List;

import com.example.hospital.Dto.DoctorDto;

public interface DoctorService {

	List<DoctorDto> getDoctorsByspecialisation(String specialisation);

	List<DoctorDto> getDoctorByhospitalId(int hospitalId);

}
