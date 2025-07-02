package com.consultori.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.consultori.modelo.Consulta;
import com.consultori.modelo.Doctor;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer>, CrudRepository<Consulta, Integer> {
		// Additional query methods can be defined here if needed
	// For example:
	// List<Consulta> findByPacienteId(Integer pacienteId);
	List<Consulta> findByDoctor(Doctor doctor);

}
