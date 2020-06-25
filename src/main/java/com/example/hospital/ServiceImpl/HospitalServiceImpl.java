package com.example.hospital.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospital.Dao.HospitalDao;
import com.example.hospital.Dto.HospitalAddressDto;
import com.example.hospital.Dto.HospitalDto;
import com.example.hospital.Service.HospitalService;
import com.example.hospital.model.Hospital;

@Service
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	HospitalDao hospitalDao;

	@Override
	public Iterable<HospitalDto> getAllHospitals() {
		Iterable<Hospital> hospitals = hospitalDao.findAll();
		List<HospitalDto> hospitalDto = new ArrayList<HospitalDto>();
		hospitals.forEach(hospital -> hospitalDto.add(getHospitalsDto(hospital)));
		return hospitalDto;
	}

	private HospitalDto getHospitalsDto(Hospital hospital) {
		HospitalDto hospitalDto = new HospitalDto();
		BeanUtils.copyProperties(hospital, hospitalDto);
		return hospitalDto;
	}

	@Override
	public List<HospitalDto> getHospitalByName(String hospitalName) {
		Optional<List<Hospital>> hospitalsOptional = hospitalDao.getHospitalByhospitalName(hospitalName);
		if (hospitalsOptional.isPresent()) {
			return hospitalsOptional.get().stream().map(hospital -> getHospitalsDto(hospital))
					.collect(Collectors.toList());
		}
		List<HospitalDto> hospitalresponseList = new ArrayList<HospitalDto>();
		return hospitalresponseList;

	}

	@Override
	public HospitalDto getHospitalById(int hospitalId) {
		Optional<Hospital> hospitalOptional = hospitalDao.findById(hospitalId);
		HospitalDto hospitalresponseDto = new HospitalDto();
		if (hospitalOptional.isPresent()) {
			BeanUtils.copyProperties(hospitalOptional.get(), hospitalresponseDto);
			return hospitalresponseDto;
		}

		return hospitalresponseDto;
	}

	@Override
	public List<HospitalAddressDto> getHospitalByaddress(String address) {
		Optional<List<Hospital>> hospitalsOptional = hospitalDao.getHospitalByaddress(address);
		if (hospitalsOptional.isPresent()) {
			return hospitalsOptional.get().stream().map(hospital -> getHospitaladdressDto(hospital))
					.collect(Collectors.toList());
		}
		List<HospitalAddressDto> hospitalresponseList = new ArrayList<HospitalAddressDto>();
		return hospitalresponseList;

	}

	private HospitalAddressDto getHospitaladdressDto(Hospital hospital) {
		HospitalAddressDto hospitalAddressDto = new HospitalAddressDto();
		BeanUtils.copyProperties(hospital, hospitalAddressDto);
		return hospitalAddressDto;
	}

}
