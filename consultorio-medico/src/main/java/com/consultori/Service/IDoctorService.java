package com.consultori.Service;


import java.util.List;
import java.util.Optional;

import com.consultori.modelo.Doctor;


public interface IDoctorService {
		// Define methods for doctor-related operations here
	// For example:
	// List<Doctor> getAllDoctors();
	// Doctor getDoctorById(Integer id);
	// void addDoctor(Doctor doctor);
	// void updateDoctor(Doctor doctor);
	// void deleteDoctor(Integer id);
	List<Doctor> getAllDoctors();
	Optional<Doctor> getDoctorById(int id_doctor);
	Doctor addDoctor(Doctor doctor);
	Doctor updateDoctor(Doctor doctor);
	void deleteDoctor(int id_doctor);

}
