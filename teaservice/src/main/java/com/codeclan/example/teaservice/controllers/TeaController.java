package com.codeclan.example.teaservice.controllers;

import com.codeclan.example.teaservice.models.Tea;
import com.codeclan.example.teaservice.repository.TeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeaController {
    @Autowired
    TeaRepository teaRepository;


    @GetMapping(value = "/api/teas")
    public List<Tea> getTeas(){
        return teaRepository.findAll();
    }

    @PostMapping(value = "/api/teas")
    public Tea addTea(@RequestBody Tea tea){
        return teaRepository.save(tea);
    }

    @DeleteMapping(value = "/api/teas/{id}")
    public void deleteBiscuit (@PathVariable Long id){
        teaRepository.deleteById(id);
    }

}
