package com.example.hospital.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int PatientId;
	private String PatientName;
	private String Patientaddress;
	private String gender;
	private String age;
	private String Patientdisease;

	

	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}

	

	

	public String getPatientName() {
		return PatientName;
	}

	public void setPatientName(String patientName) {
		PatientName = patientName;
	}

	public String getPatientaddress() {
		return Patientaddress;
	}

	public void setPatientaddress(String patientaddress) {
		Patientaddress = patientaddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPatientdisease() {
		return Patientdisease;
	}

	public void setPatientdisease(String patientdisease) {
		Patientdisease = patientdisease;
	}
	@Override
	public String toString() {
		return "Patient [PatientId=" + PatientId + ",   PatientName=" + PatientName + ", Patientaddress=" + Patientaddress + ", gender="
				+ gender + ", age=" + age + ", Patientdisease=" + Patientdisease +  "]";
	}


}
