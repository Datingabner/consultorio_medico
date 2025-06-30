package com.consultori.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import com.consultori.modelo.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>,CrudRepository<Doctor, Integer>{

}
