package com.example.hospital.Dto;

public class PatientDto {
	
	
	private String PatientName;
	private String Patientaddress;
	private String gender;
	private String age;
	private String Patientdisease;
	
	
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
	
	
}
