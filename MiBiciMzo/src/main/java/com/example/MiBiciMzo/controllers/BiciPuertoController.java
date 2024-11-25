package com.example.MiBiciMzo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MiBiciMzo.services.BiciPuertoService;

@RestController
@RequestMapping("/api/bicipuertos")
public class BiciPuertoController {

    @Autowired
    BiciPuertoService service;

    @GetMapping("/{nombre}/bicis-disponibles")
    public int obtenerBicisDisponibles(@PathVariable String nombre) {
        return service.obtenerBicisDisponiblesPorNombre(nombre);
    }
}
