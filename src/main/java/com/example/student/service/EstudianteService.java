package com.example.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student.entity.Estudiante;
import com.example.student.repository.EstudianteRepository;

@Service
public class EstudianteService {
    private final EstudianteRepository estudianteRepository;
    
    public EstudianteService(EstudianteRepository estudianteRepository){
        this.estudianteRepository = estudianteRepository;
    }

    public List<Estudiante> listaEstudiantes(){
        return estudianteRepository.findAll();
    }

    public Estudiante guarEstudiante(Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }

}
