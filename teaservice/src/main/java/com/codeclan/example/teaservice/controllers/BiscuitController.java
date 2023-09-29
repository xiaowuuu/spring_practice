package com.codeclan.example.teaservice.controllers;

import com.codeclan.example.teaservice.models.Biscuit;
import com.codeclan.example.teaservice.repository.BiscuitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BiscuitController {
    @Autowired
    BiscuitRepository biscuitRepository;


    @GetMapping(value = "/api/biscuits") //request
    public List<Biscuit> getAllBiscuits(){
        return biscuitRepository.findAll();
    }

    @PostMapping(value = "/api/biscuits")
    public Biscuit addBiscuit(@RequestBody Biscuit biscuit){
        return biscuitRepository.save(biscuit);
    }

    @DeleteMapping(value = "/api/biscuits/{id}")
    public void deleteBiscuit (@PathVariable Long id){
        biscuitRepository.deleteById(id);
    }
}
