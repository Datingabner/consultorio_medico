package com.consultori.Service;

import java.util.List;
import java.util.Optional;

import com.consultori.modelo.Paciente;

public interface IPacienteService {
	
	public Paciente addPaciente(Paciente paciente);
	public Paciente updatePaciente(Paciente paciente);
	public void deletePaciente(int id_paciente);
	public Optional<Paciente> getPacienteById(int id_paciente);
	public List<Paciente> getAllPacientes();

}
