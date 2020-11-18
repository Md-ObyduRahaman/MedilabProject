package com.medilab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medilab.config.AppConfig;
import com.medilab.model.Appointment;
import com.medilab.service.PatientService;
import com.medilab.sms.Service;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	PatientService patientService;
	@Autowired
	AppConfig app;
	@Autowired
	Appointment appointment;
	@Autowired
	Service service;
	
	@RequestMapping("/index")
	public String index(Model model) {
		System.out.println("controller is ok");
		return "index";
	}

	@PostMapping("/add" )
	public void add(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("phone") String phone,
			@RequestParam("date") String date,
			@RequestParam("department") String department,
			@RequestParam("doctor") String doctor
			) {
		System.out.println("controller is Work"+name);
		appointment.setDate(date);
		appointment.setName(name);
		appointment.setEmail(email);
		appointment.setPhoneNumber(phone);
		appointment.setDepartment(department);
		appointment.setDoctor(doctor);
		patientService.saveOrUpdate(appointment);
		appointment.toString();
		service.sendSms(appointment);
		
		
	}
	
	@RequestMapping("/inner-page")
	public String example() {
		return "inner-page";
	}
}
