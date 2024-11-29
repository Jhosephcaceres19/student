package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.entity.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long>{

}
