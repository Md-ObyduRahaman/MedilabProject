package com.medilab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medilab.model.Appointment;
import com.medilab.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepository;
	
	public void saveOrUpdate(Appointment appointment)
	{
		patientRepository.save(appointment);
	}
}
