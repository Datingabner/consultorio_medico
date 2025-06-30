package com.consultori.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.consultori.modelo.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>, CrudRepository<Paciente, Integer> {
	
	// Additional query methods can be defined here if needed
	// For example:
	// List<Paciente> findByLastName(String lastName);

}
