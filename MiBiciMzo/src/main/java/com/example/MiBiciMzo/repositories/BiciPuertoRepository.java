package com.example.MiBiciMzo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MiBiciMzo.models.BiciPuertoModel;

public interface BiciPuertoRepository extends JpaRepository<BiciPuertoModel, Long> {
    BiciPuertoModel findByNombre(String nombre);
}