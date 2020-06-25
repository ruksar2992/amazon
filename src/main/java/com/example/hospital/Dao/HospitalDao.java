package com.example.hospital.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hospital.model.Hospital;

@Repository
public interface HospitalDao extends CrudRepository<Hospital, Integer> {
    @Query(value="select * from hospital h where h.hospital_name like %:hospitalName%",nativeQuery = true)
    Optional<List<Hospital>> getHospitalByhospitalName(@Param("hospitalName")String hospitalName);

 

    @Query(value="select h.address from hospital h where h.hospitalId=:hospitalId",nativeQuery = true)
    int findAddressByhospitalId(@Param("hospitalId")int hospitalId);

 

    @Query(value="select h.hospital_name from hospital h where h.hospitalId=:hospitalId",nativeQuery = true)
    String findhospitalNameByhospitalId(int hospitalId);


    @Query(value="select * from hospital h where h.address like %:ad%",nativeQuery = true)
	Optional<List<Hospital>> getHospitalByaddress(@Param("ad")String address);
}
 

