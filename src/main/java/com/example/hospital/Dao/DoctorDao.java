package com.example.hospital.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hospital.model.Doctor;



@Repository
public interface DoctorDao extends CrudRepository<Doctor, Integer> {

	//Optional<List<Doctor>> getDoctorsByspecialisation(String specialisation);
	
	@Query(value="select * from doctor h where h.specialisation like %:apple%",nativeQuery = true)
    Optional<List<Doctor>> getDoctorsByspecialisation(@Param("apple")String specialisation);

	Optional<List<Doctor>> getDoctorByhospitalId(int hospitalId);

 
}
