package com.codeclan.example.pirateservice_d1_starter.controllers;

import com.codeclan.example.pirateservice_d1_starter.models.Raid;
import com.codeclan.example.pirateservice_d1_starter.repositories.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RaidController {
    @Autowired
    RaidRepository raidRepository;

    @GetMapping(value = "/raids")
    public List<Raid> getAllraids(){
        return raidRepository.findAll();
    }
    @GetMapping(value = "/raids/{id}")
    public Optional getOneRaid(@PathVariable Long id){
        return raidRepository.findById(id);
    }
}
