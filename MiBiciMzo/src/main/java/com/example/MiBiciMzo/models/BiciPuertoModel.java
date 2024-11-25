package com.example.MiBiciMzo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "bicipuertos")
public class BiciPuertoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // ID único para cada bicipuerto

    @Column(nullable = false, unique = true)
    private String nombre; // Nombre del bicipuerto

    @Column(nullable = false)
    private int bicisDisponibles; // Bicicletas disponibles
}

