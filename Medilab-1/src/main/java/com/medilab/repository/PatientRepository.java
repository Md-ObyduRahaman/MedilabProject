package com.medilab.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.medilab.model.Appointment;
@EnableJpaRepositories
public interface PatientRepository extends CrudRepository<Appointment, String>    {

}
