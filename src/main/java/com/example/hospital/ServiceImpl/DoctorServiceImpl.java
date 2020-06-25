package com.example.hospital.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospital.Dao.DoctorDao;
import com.example.hospital.Dto.DoctorDto;

import com.example.hospital.Service.DoctorService;
import com.example.hospital.model.Doctor;


@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired
	DoctorDao doctorDao;
	
	@Override
	public List<DoctorDto> getDoctorsByspecialisation(String specialisation) {
		Optional<List<Doctor>> doctorsOptional = doctorDao.getDoctorsByspecialisation(specialisation);
		if (doctorsOptional.isPresent()) {
			return doctorsOptional.get().stream().map(Doctor -> getDoctorsDto(Doctor)).collect(Collectors.toList());
		}
		List<DoctorDto> DoctorresponseList = new ArrayList<DoctorDto>();
		return DoctorresponseList;

	
	}

	private DoctorDto getDoctorsDto(Doctor doctor) {
		DoctorDto DoctorDto = new DoctorDto();
		BeanUtils.copyProperties(doctor, DoctorDto);
		return DoctorDto;
	}

	@Override
	public List<DoctorDto> getDoctorByhospitalId(int hospitalId) {
		  List<DoctorDto> DoctorDtoList= new ArrayList<DoctorDto>();
		  Optional<List<Doctor>> doctors =doctorDao.getDoctorByhospitalId(hospitalId);
		System.out.println(doctors);
		if(doctors.isPresent())
			return doctors.get().stream().map(Doctor -> getDoctorsDto(Doctor)).collect(Collectors.toList());
		else {
			return DoctorDtoList;
		}
		
	}


}
