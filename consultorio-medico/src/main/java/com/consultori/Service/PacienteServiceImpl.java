package com.consultori.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultori.modelo.Paciente;
import com.consultori.repository.PacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Override
	public Paciente addPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		return pacienteRepository.save(paciente);
	}

	@Override
	public Paciente updatePaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		return pacienteRepository.save(paciente);
	}

	@Override
	public void deletePaciente(int id_paciente) {
		// TODO Auto-generated method stub
		pacienteRepository.deleteById(id_paciente);		
	}

	@Override
	public Optional<Paciente> getPacienteById(int id_paciente) {
		// TODO Auto-generated method stub
		return pacienteRepository.findById(id_paciente);
	}

	@Override
	public List<Paciente> getAllPacientes() {
		// TODO Auto-generated method stub
		return pacienteRepository.findAll();
	}

}
