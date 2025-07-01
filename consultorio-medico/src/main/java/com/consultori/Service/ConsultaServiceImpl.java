package com.consultori.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultori.modelo.Consulta;
import com.consultori.repository.ConsultaRepository;

@Service
public class ConsultaServiceImpl implements IConsultaService{
	
	@Autowired
	private ConsultaRepository consultaRepository;

	@Override
	public Consulta addConsulta(Consulta consulta) {
		// TODO Auto-generated method stub
		return consultaRepository.save(consulta);
	}

	@Override
	public Consulta updateConsulta(Consulta consulta) {
		// TODO Auto-generated method stub
		return consultaRepository.save(consulta);
	}

	@Override
	public void deleteConsulta(int id_consulta) {
		// TODO Auto-generated method stub
		consultaRepository.deleteById(id_consulta);		
	}

	@Override
	public Optional<Consulta> getConsultaById(int id_consulta) {
		// TODO Auto-generated method stub
		return consultaRepository.findById(id_consulta);
	}

	@Override
	public List<Consulta> getAllConsultas() {
		return consultaRepository.findAll();
	}
	
}
