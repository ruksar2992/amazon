package com.example.hospital.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Appointmentid;
	private long doctorId;
	
	private int PatientId;
	private int userId;
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	private LocalDateTime DateTime;

	public long getAppointmentid() {
		return Appointmentid;
	}

	public void setAppointmentid(long appointmentid) {
		Appointmentid = appointmentid;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	
	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}

	public LocalDateTime getDateTime() {
		return DateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		DateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Appointment [Appointmentid=" + Appointmentid + ", doctorId=" + doctorId + ", PatientId=" + PatientId
				+ ",userId=" + userId + ",DateTime=" + DateTime + "]";
	}
}
