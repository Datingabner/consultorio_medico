package com.consultori.controller;

import org.springframework.web.bind.annotation.RestController;

import com.consultori.Service.PacienteServiceImpl;
import com.consultori.modelo.Paciente;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping({"pacientes"})
public class PacienteController {
	
	// Aquí puedes definir los endpoints para manejar las operaciones CRUD de Paciente
	// Por ejemplo:
	// @PostMapping("/pacientes")
	// public ResponseEntity<Paciente> addPaciente(@RequestBody Paciente paciente) {
	//     // Lógica para agregar un paciente
	// }
	
	// @GetMapping("/pacientes/{id}")
	// public ResponseEntity<Paciente> getPacienteById(@PathVariable int id) {
	//     // Lógica para obtener un paciente por ID
	// }
	
	// @PutMapping("/pacientes")
	// public ResponseEntity<Paciente> updatePaciente(@RequestBody Paciente paciente) {
	//     // Lógica para actualizar un paciente
	// }
	
	// @DeleteMapping("/pacientes/{id}")
	// public ResponseEntity<Void> deletePaciente(@PathVariable int id) {
	//     // Lógica para eliminar un paciente
	// }
	
	@Autowired
	private PacienteServiceImpl pacienteService;
	
	@GetMapping("/ver-pacientes")
	public List<Paciente> getMethodName() {
		return (List<Paciente>) pacienteService.getAllPacientes() ;
	}
	
	
	@PostMapping("/agregar-paciente")
	public ResponseEntity<Paciente> postAgregarPaciente(@RequestBody Paciente paciente) {
		paciente = pacienteService.addPaciente(paciente);
		return new ResponseEntity<Paciente>(paciente,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/ver-pacientes/{id_paciente}")
	public Optional<Paciente> getPacienteById(@PathVariable int id_paciente){
		return pacienteService.getPacienteById(id_paciente);
	}
	
	@PutMapping("actualizar-paciente/{id}")
	public ResponseEntity<Paciente> putActualizarPacienteById(@PathVariable int id, @RequestBody Paciente paciente) {
		paciente.setId_paciente(id);
		if( paciente.getId_paciente()>0 &&pacienteService.getPacienteById(id).isPresent() ) {
			paciente=pacienteService.addPaciente(paciente);
			return new ResponseEntity<Paciente>(paciente,HttpStatus.ACCEPTED); 
		}else {
			return new ResponseEntity<Paciente>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@DeleteMapping("/eliminar-paciente/{id}")
	public ResponseEntity<Paciente> deletePacienteById(@PathVariable int id) {
		if (pacienteService.getPacienteById(id).isPresent()) {
			pacienteService.deletePaciente(id);
			return new ResponseEntity<Paciente>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Paciente> (HttpStatus.NOT_FOUND);
		}
	}
	
}
