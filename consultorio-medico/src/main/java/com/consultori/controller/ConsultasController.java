package com.consultori.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consultori.Service.ConsultaServiceImpl;
import com.consultori.modelo.Consulta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping({"consultas"})
public class ConsultasController {

		// Aquí puedes agregar los endpoints para manejar las operaciones CRUD de consultas
	// Ejemplo: @GetMapping, @PostMapping, etc.
	// Por ahora, este controlador está vacío y se puede completar según las necesidades del proyecto.
	
	@Autowired
	private ConsultaServiceImpl consultaService;
	
	// Puedes agregar métodos aquí para manejar las consultas, como obtener todas las consultas,
	@GetMapping("/ver-consultas")
	public List<Consulta> getConsultas() {
		return consultaService.getAllConsultas();
	}
	
	@PostMapping("/agregar-consulta")
	public ResponseEntity<Consulta> postAgregarConsulta(@RequestBody Consulta consulta) {
		consulta=consultaService.addConsulta(consulta);
		return new ResponseEntity<Consulta> (consulta,HttpStatus.CREATED);
	}
	
	@GetMapping("/ver-consultas/{id}")
	public Optional<Consulta> getConsultaById(@RequestParam int id) {
		return consultaService.getConsultaById(id);
	}
	
	@PutMapping("/editar-consulta/{id}")
	public ResponseEntity<Consulta> putActualizarConsulta(@PathVariable int id, @RequestBody Consulta consulta) {
		consulta.setId_consulta(id);
		if(consulta.getId_consulta()>0&&consultaService.getConsultaById(id).isPresent()) {
		consulta= consultaService.updateConsulta(consulta);
		return new ResponseEntity<Consulta> (consulta,HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<Consulta>(consulta,HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/eliminar-consulta/{id}")
	public ResponseEntity<Consulta> deleteConsultaById(@PathVariable int id){
		if(consultaService.getConsultaById(id).isPresent()) {
			consultaService.deleteConsulta(id);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	
	
}
