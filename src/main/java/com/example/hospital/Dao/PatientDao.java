package com.example.hospital.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.model.Patient;

@Repository
public interface PatientDao extends CrudRepository<Patient, Integer> {
	

}
