package com.example.hospital.ServiceImpl;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospital.Dao.AppointmentDao;
import com.example.hospital.Dto.AppointmentDto;
import com.example.hospital.Service.AppointmentService;
import com.example.hospital.model.Appointment;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	AppointmentDao appointmentDao;

	@Override
	public String BookAppointment(AppointmentDto appointmentDto) {
		Appointment appointment= new Appointment();
		appointment.setUserId(appointmentDto.getUserId());
		appointment.setDoctorId(appointmentDto.getDoctorId());
		appointment.setPatientId(appointmentDto.getPatientId());
		appointment.setDateTime(LocalDateTime.now());
		Appointment BookAppointment=appointmentDao.save(appointment);
		return "Your Appointment has placed successfully, your Appointmentid:"+BookAppointment.getAppointmentid();
		} 
		
		
}
