package com.example.MiBiciMzo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor; // Importa NoArgsConstructor

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor  // Añade el constructor sin parámetros
@Entity
@Table(name = "bicicletas")
public class BicisModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // ID único para cada 
    
    private String ubicacion;
    private Boolean averiada;
    private Boolean robada; 
}
