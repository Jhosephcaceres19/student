package com.example.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Estudiante;
import com.example.student.service.EstudianteService;

@RestController
@RequestMapping("api/v1/estudiantes")
public class EstudianteController {
    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService){
        this.estudianteService = estudianteService;
    }

    @GetMapping
    public List<Estudiante> listarEstudiantes(){
        return estudianteService.listaEstudiantes();
    }

    @PostMapping
    public Estudiante guardarEstudiante(@RequestBody Estudiante estudiante){
        return estudianteService.guarEstudiante(estudiante);
    }

}
