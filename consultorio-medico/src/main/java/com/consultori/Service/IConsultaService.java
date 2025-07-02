package com.consultori.Service;

import java.util.List;
import java.util.Optional;

import com.consultori.modelo.Consulta;
import com.consultori.modelo.Doctor;

public interface IConsultaService {

	public Consulta addConsulta(Consulta consulta);
	public Consulta updateConsulta(Consulta consulta);
	public void deleteConsulta(int id_consulta);
	public Optional<Consulta> getConsultaById(int id_consulta);
	public List<Consulta> getAllConsultas();
	public List<Consulta> getAllConsultasByIdDoctor(Doctor idDoctor);
}
