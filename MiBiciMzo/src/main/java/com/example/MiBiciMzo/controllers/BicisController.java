package com.example.MiBiciMzo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MiBiciMzo.models.BicisModel;
import com.example.MiBiciMzo.services.BicisService;

@RestController
@RequestMapping("/api/bicis")
public class BicisController {

    @Autowired
    BicisService bicisService;

    @PatchMapping("/{id}/averiado")
    public BicisModel updateAveriado(@PathVariable Long id, @RequestParam boolean averiada) {
        return bicisService.updateAverdido(id, averiada);
    }

    @PatchMapping("/{id}/robo")
    public BicisModel updateRobo(@PathVariable Long id, @RequestParam boolean robado) {
        return bicisService.updateRobo(id, robado);
    }

    @GetMapping("/{id}/averiado")
    public boolean getAverdido(@PathVariable Long id) {
        return bicisService.getAverdidoById(id);
    }

}
