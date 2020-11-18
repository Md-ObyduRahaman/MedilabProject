package com.medilab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Appointment {

	private String name;
	@Id
	private String email;
	private String phoneNumber;
	private String date;
	private String department;
	private String doctor;

	/*
	 * public Appointment() { super(); // TODO Auto-generated constructor stub }
	 * public Appointment(String name, String email, String phone, String date,
	 * String department, String doctor) { super(); this.name = name; this.email =
	 * email; this.phone = phone; this.date = date; this.department = department;
	 * this.doctor = doctor; }
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	@Override
	public String toString() {
		return "Appointment [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", date=" + date
				+ ", department=" + department + ", doctor=" + doctor + "]";
	}
	
	
	
	
	
}
