package com.consultori.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONSULTA")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_CONSULTA")
	private int id_consulta;
	@ManyToOne
    @JoinColumn(name = "ID_DOCTOR", referencedColumnName = "ID_DOCTOR")
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name = "ID_PACIENTE", referencedColumnName = "ID_PACIENTE")
	private Paciente paciente;
	
	@Column(name = "FECHA_HORA")
	private LocalDateTime fecha_hora;
	
	@Column(name = "ESTADO")
	private String estado;

	public Consulta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consulta(int id_consulta, Doctor id_doctor, Paciente paciente, LocalDateTime fecha_hora, String estado) {
		super();
		this.id_consulta = id_consulta;
		this.doctor = id_doctor;
		this.paciente = paciente;
		this.fecha_hora = fecha_hora;
		this.estado = estado;
	}

	public int getId_consulta() {
		return id_consulta;
	}

	public void setId_consulta(int id_consulta) {
		this.id_consulta = id_consulta;
	}

	public Doctor getId_doctor() {
		return doctor;
	}

	public void setId_doctor(Doctor id_doctor) {
		this.doctor = id_doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setId_paciente(Paciente paciente) {
		this.paciente = paciente;
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
