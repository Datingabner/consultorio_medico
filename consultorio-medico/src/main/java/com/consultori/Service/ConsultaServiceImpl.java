package com.consultori.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultori.modelo.Consulta;
import com.consultori.modelo.ConsultaDTO;
import com.consultori.modelo.Doctor;
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

	@Override
	public List<Consulta> getAllConsultasByIdDoctor(Doctor idDoctor) {
		return consultaRepository.findByDoctor(idDoctor);
	}
	
	@Override
	public List<ConsultaDTO> getConsultasSimplificadas() {
	    List<Consulta> consultas = consultaRepository.findAll();
	    return consultas.stream().map(consulta -> {
	        ConsultaDTO dto = new ConsultaDTO();
	        // Mapear campos simples
	        dto.setId_consulta(consulta.getId_consulta());
	        dto.setFecha_hora(consulta.getFecha_hora());
	        dto.setEstado(consulta.getEstado());
	        
	        // Mapear solo IDs
	        dto.setId_paciente(consulta.getPaciente().getId_paciente());
	        dto.setId_doctor(consulta.getId_doctor().getId_doctor());
	        
	        return dto;
	    }).collect(Collectors.toList());
	}

	@Override
	public Optional<ConsultaDTO> getConsultaSimplificadaById(int id_consulta) {
	    return consultaRepository.findById(id_consulta)
	            .map(consulta -> {
	                ConsultaDTO dto = new ConsultaDTO();
	                // Mapear campos básicos
	                dto.setId_consulta(consulta.getId_consulta());
	                dto.setFecha_hora(consulta.getFecha_hora());
	                dto.setEstado(consulta.getEstado());
	                
	                // Mapear solo IDs de relaciones
	                if (consulta.getPaciente() != null) {
	                    dto.setId_paciente(consulta.getPaciente().getId_paciente());
	                }
	                if (consulta.getId_doctor() != null) {
	                    dto.setId_doctor(consulta.getId_doctor().getId_doctor());
	                }
	                
	                return dto;
	            });
	}
	
}
