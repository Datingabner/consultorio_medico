package com.consultori.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DOCTOR")
public class Doctor {
	
	@Id
	@Column(name = "ID_DOCTOR")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_doctor;
	
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "ESPECIALIDAD")
	private String especialidad;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int id_doctor, String nombre, String especialidad) {
		super();
		this.id_doctor = id_doctor;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}
	public int getId_doctor() {
		return id_doctor;
	}
	public void setId_doctor(int id_doctor) {
		this.id_doctor = id_doctor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
