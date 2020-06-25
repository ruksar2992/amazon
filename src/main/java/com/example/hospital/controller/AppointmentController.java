package com.example.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.Dto.AppointmentDto;
import com.example.hospital.Service.AppointmentService;

@RestController
public class AppointmentController {
	@Autowired
	AppointmentService appointmentService;

	@PostMapping("/Appointments")
	public String BookAppointment(@RequestBody AppointmentDto appointmentDto) {
		return appointmentService.BookAppointment(appointmentDto);
	}
}
