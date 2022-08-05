package com.example.restservice.controller;

import com.example.restservice.model.Categorie;
import com.example.restservice.model.Employe;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class EmployeController {
    private List<Employe> employes;

    public List <Employe> getAllEmployes(){
        return employes;
    }

    @PostMapping
    public  void create(Employe employe){
        employes.add(employe);
    }
}
