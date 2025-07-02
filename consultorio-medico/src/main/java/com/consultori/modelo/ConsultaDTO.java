package com.consultori.modelo;

import java.time.LocalDateTime;

public class ConsultaDTO {
	private Integer id_doctor;
	private LocalDateTime fecha_hora;
	private String estado;
	private Integer id_paciente;
	public ConsultaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConsultaDTO(Integer id_doctor, LocalDateTime fecha_hora, String estado, Integer id_paciente) {
		super();
		this.id_doctor = id_doctor;
		this.fecha_hora = fecha_hora;
		this.estado = estado;
		this.id_paciente = id_paciente;
	}
	public Integer getId_doctor() {
		return id_doctor;
	}
	public void setId_doctor(Integer id_doctor) {
		this.id_doctor = id_doctor;
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
	public Integer getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(Integer id_paciente) {
		this.id_paciente = id_paciente;
	}
	
	
}
