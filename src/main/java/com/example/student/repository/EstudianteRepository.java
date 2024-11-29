package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{


}
