package com.consultori.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_CONSULTA")
	private int id_consulta;
	
	@Column(name = "ID_DOCTOR")
	private int id_doctor;
	
	@Column(name = "ID_PACIENTE")
	private int id_paciente;
	
	@Column(name = "FECHA_HORA")
	private LocalDateTime fecha_hora;
	
	@Column(name = "ESTADO")
	private String estado;

	public Consulta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consulta(int id_consulta, int id_doctor, int id_paciente, LocalDateTime fecha_hora, String estado) {
		super();
		this.id_consulta = id_consulta;
		this.id_doctor = id_doctor;
		this.id_paciente = id_paciente;
		this.fecha_hora = fecha_hora;
		this.estado = estado;
	}

	public int getId_consulta() {
		return id_consulta;
	}

	public void setId_consulta(int id_consulta) {
		this.id_consulta = id_consulta;
	}

	public int getId_doctor() {
		return id_doctor;
	}

	public void setId_doctor(int id_doctor) {
		this.id_doctor = id_doctor;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public LocalDateTime getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(LocalDateTime fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
