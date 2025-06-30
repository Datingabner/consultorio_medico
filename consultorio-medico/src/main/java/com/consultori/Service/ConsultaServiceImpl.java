package com.consultori.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultori.modelo.Consulta;

@Service
public class ConsultaServiceImpl implements IConsultaService{
	
	@Autowired
	private IConsultaService consultaService;

	@Override
	public Consulta addConsulta(Consulta consulta) {
		// TODO Auto-generated method stub
		return consultaService.addConsulta(consulta);
	}

	@Override
	public Consulta updateConsulta(Consulta consulta) {
		// TODO Auto-generated method stub
		return consultaService.updateConsulta(consulta);
	}

	@Override
	public void deleteConsulta(int id_consulta) {
		// TODO Auto-generated method stub
		consultaService.deleteConsulta(id_consulta);		
	}

	@Override
	public Optional<Consulta> getConsultaById(int id_consulta) {
		// TODO Auto-generated method stub
		return consultaService.getConsultaById(id_consulta);
	}

	@Override
	public List<Consulta> getAllConsultas() {
		return consultaService.getAllConsultas();
	}
	
}
