package com.example.hospital.patient.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PatientRegister {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "nic")
	private String nic;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "bloodGroup")
	private String bloodGroup;
	
	@Column(name = "password")
	private String password;
	
	
	public PatientRegister() {
		super();
	}

	public PatientRegister(Long patientId, String name, String dob, String address, String email, String gender,
			String nic, String phone, String bloodGroup, String password) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.gender = gender;
		this.nic = nic;
		this.phone = phone;
		this.bloodGroup = bloodGroup;
		this.password = password;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
	
	
}
