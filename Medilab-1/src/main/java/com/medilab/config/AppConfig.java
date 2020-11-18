package com.medilab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.medilab.model.Appointment;

@Configuration
public class AppConfig {

	@Bean
	public Appointment app() {
		return new Appointment();
	}
}
