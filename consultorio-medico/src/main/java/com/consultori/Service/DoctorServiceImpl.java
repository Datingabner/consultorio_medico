package com.consultori.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultori.modelo.Doctor;
import com.consultori.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService{
	
	@Autowired
	private DoctorRepository docRepository;
	
	@Override
	public List<Doctor> getAllDoctors() {
		return docRepository.findAll();
	}

	@Override
	public Optional<Doctor> getDoctorById(int id_doctor) {
		// TODO Auto-generated method stub
		return docRepository.findById(id_doctor);
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		return docRepository.save(doctor);		
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		return docRepository.save(doctor);
	}

	@Override
	public void deleteDoctor(int id_doctor) {
		docRepository.deleteById(id_doctor);
	}

}
