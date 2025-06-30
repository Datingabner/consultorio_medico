package com.consultori.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consultori.modelo.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
		// Additional query methods can be defined here if needed
	// For example:
	// List<Consulta> findByDoctorId(Integer doctorId);
	// List<Consulta> findByPacienteId(Integer pacienteId);

}
