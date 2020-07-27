package com.codeclan.example.pirateservice_d1_starter.controllers;

import com.codeclan.example.pirateservice_d1_starter.models.Ship;
import com.codeclan.example.pirateservice_d1_starter.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ShipController {
    @Autowired
    ShipRepository shipRepository;

    @GetMapping(value = "/ships")
    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }
    @GetMapping(value = "/ships/{id}")
    public Optional<Ship> getOneShip(@PathVariable Long id){
        return shipRepository.findById(id);
    }
}
