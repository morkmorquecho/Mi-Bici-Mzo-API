package com.example.MiBiciMzo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MiBiciMzo.models.BicisModel;
import com.example.MiBiciMzo.repositories.BicisRepository;

@Service
public class BicisService {

    @Autowired    
    BicisRepository bicisRepository;

    public BicisModel updateAverdido(Long id, boolean averiado) {
        Optional<BicisModel> bici = bicisRepository.findById(id);
        if (bici.isPresent()) {
            BicisModel bicisModel = bici.get();
            bicisModel.setAveriada(averiado);
            return bicisRepository.save(bicisModel);
        } else {
            throw new RuntimeException("Bicicleta no encontrada");
        }
    }

    public BicisModel updateRobo(Long id, boolean robada) {
        Optional<BicisModel> bici = bicisRepository.findById(id);
        if (bici.isPresent()) {
            BicisModel bicisModel = bici.get();
            bicisModel.setRobada(robada);
            return bicisRepository.save(bicisModel);
        } else {
            throw new RuntimeException("Bicicleta no encontrada");
        }
    }

    public boolean getAverdidoById(Long id) {
        BicisModel bicisModel = bicisRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Bicicleta no encontrada"));
        return bicisModel.getAveriada();
    }


    public List<BicisModel> getAllBicis() {
        return bicisRepository.findAll();
    }
}
