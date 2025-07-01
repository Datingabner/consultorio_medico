package com.consultori.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consultori.Service.DoctorServiceImpl;
import com.consultori.modelo.Doctor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RequestMapping({"doctores"})
public class DoctorController {
	
	// Aquí puedes agregar los endpoints para manejar las operaciones CRUD de doctores
	// Ejemplo: @GetMapping, @PostMapping, etc.
	// Puedes implementar métodos similares a los de AutomovilController para manejar doctores.
	
	// Ejemplo de método para obtener todos los doctores (aún no implementado)
	// @GetMapping("/ver-todos")
	// public List<Doctor> getDoctores() {
	//     return doctorService.obtenerTodosLosDoctores();
	// }
	
	// Otros métodos como postDoctor, putDoctor, deleteDoctor, etc. se pueden agregar aquí.
	
	@Autowired
	private DoctorServiceImpl doctorService;
	
	
	
	@GetMapping("/ver-doctores")	
	public List<Doctor> obtenerTodosLosDoctores() {
		return (List<Doctor>) doctorService.getTodosLosDoctores();
	}
	
	@PostMapping("agregar-doctor")
	public ResponseEntity<Doctor> postAgregarDoctor(@RequestBody Doctor doctor) {
		//TODO: process POST request
		doctorService.addDoctor(doctor);
		return new ResponseEntity<>(doctor,HttpStatus.CREATED);
	}
	
	@PutMapping("actualizar-doctor/{id}")
	public ResponseEntity<Doctor> putMethodName(@PathVariable int id, @RequestBody Doctor doctor) {
		doctor.setId_doctor(id);
		if(doctor.getId_doctor()>0&&doctorService.getDoctorPorId(id).isPresent()) {
			doctor=doctorService.updateDoctor(doctor);
			return new ResponseEntity<>(doctor, HttpStatus.FOUND);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	@DeleteMapping("eliminar-doctor/{id}")
	public ResponseEntity<Doctor> deleteDoctor(@PathVariable int id) {
		if(doctorService.getDoctorPorId(id).isPresent()) {
			doctorService.deleteDoctor(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
}
