package com.example.hospital.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.model.Appointment;

@Repository
public interface AppointmentDao extends CrudRepository<Appointment, Integer> {

}
