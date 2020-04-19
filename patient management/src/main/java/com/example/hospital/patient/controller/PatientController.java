package com.example.hospital.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.patient.model.PatientRegister;
import com.example.hospital.patient.repository.patientRepo;

import javassist.NotFoundException;

@RestController
@RequestMapping("/cruds")
public class PatientController {

	@Autowired
	private patientRepo patientrepo;
	
	@GetMapping("/patient")
	public List<PatientRegister> getAllPatient()
	{
		return patientrepo.findAll();
	}
	
	@GetMapping("/patient")
	public PatientRegister createPatient(@RequestBody PatientRegister patientRegister)
	{
		return patientrepo.save(patientRegister);
	}
	
	@GetMapping("/patient/{patientId}")
	public ResponseEntity<PatientRegister> getPatientById(@PathVariable(value = "patientId") long patientId) throws NotFoundException
	{
		PatientRegister patientRegister = patientrepo.findById(patientId).orElseThrow(()-> new NotFoundException("Patient Not found from this ID :: " + patientId));
		return ResponseEntity.ok().body(patientRegister);
	}
	
	@PutMapping("/patient/{patientId}")
	public ResponseEntity<PatientRegister> updatePatient(@PathVariable(value = "patientId") long patientId , @RequestBody PatientRegister patientDetails) throws NotFoundException 
	{
		PatientRegister patientRegister = patientrepo.findById(patientId).orElseThrow(()-> new NotFoundException("Patient Not found from this ID :: " + patientId));
		patientRegister.setName(patientDetails.getName());
		patientRegister.setDob(patientDetails.getDob());
		patientRegister.setAddress(patientDetails.getAddress());
		patientRegister.setEmail(patientDetails.getEmail());
		patientRegister.setGender(patientDetails.getGender());
		patientRegister.setNic(patientDetails.getNic());
		patientRegister.setPhone(patientDetails.getPhone());
		patientRegister.setBloodGroup(patientDetails.getBloodGroup());
		patientRegister.setPassword(patientDetails.getPassword());
		patientrepo.save(patientRegister);
		return ResponseEntity.ok().body(patientRegister);
		
	}
	
	@DeleteMapping("/patient/{patientId}")
	public ResponseEntity<?> deletePatient(@PathVariable(value = "patientId") long patientId) throws NotFoundException
	{
		patientrepo.findById(patientId).orElseThrow(()-> new NotFoundException("Patient Not found from this ID :: " + patientId));
		patientrepo.deleteById(patientId);
		return ResponseEntity.ok().build();
	}
}
