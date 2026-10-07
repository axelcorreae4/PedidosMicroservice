package com.axel.pagos.usuarios.usuarios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Autor: AxelCorreaE
 * Versión: 1.0
 * Fecha: 05/10/2026
 */
@RestController
@RequestMapping("/users")
public class UsuarioController {

    @GetMapping("/hello")
    public String hello(){
        return "Hola desde el microservicio de usuarios";
    }
}
