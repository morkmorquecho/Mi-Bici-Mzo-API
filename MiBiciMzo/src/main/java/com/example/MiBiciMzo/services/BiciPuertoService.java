package com.example.MiBiciMzo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MiBiciMzo.models.BiciPuertoModel;
import com.example.MiBiciMzo.repositories.BiciPuertoRepository;

@Service
public class BiciPuertoService {

    @Autowired 
    BiciPuertoRepository biciPuertoRepository;

    public int obtenerBicisDisponiblesPorNombre(String nombre) {
        BiciPuertoModel bicipuerto = biciPuertoRepository.findByNombre(nombre);
        if (bicipuerto != null) {
            return bicipuerto.getBicisDisponibles();
        } else {
            throw new IllegalArgumentException("Bicipuerto no encontrado: " + nombre);
        }
    }
}
