package com.example.hospital.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospital.patient.model.PatientRegister;

@Repository
public interface patientRepo extends JpaRepository<PatientRegister, Long>{

	
	
}
