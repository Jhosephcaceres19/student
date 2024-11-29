package com.example.student.service;

import org.springframework.stereotype.Service;

import com.example.student.util.JwtUtil;

@Service
public class JwtService {
    private final JwtUtil jwtUtil;

    public JwtService(JwtUtil jwtUtil){
        this.jwtUtil = jwtUtil;
    }

    public String generarToken(String username){
        return jwtUtil.generateToken(username);
    }

    public boolean validarToken(String token, String username){
        return jwtUtil.validateToken(token, username);
    }
}
