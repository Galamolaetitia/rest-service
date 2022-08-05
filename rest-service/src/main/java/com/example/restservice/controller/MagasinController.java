package com.example.restservice.controller;

import com.example.restservice.model.Employe;
import com.example.restservice.model.Magasin;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class MagasinController {

    private List<Magasin> magasins;

    public List <Magasin> getAllMagasin(){
        return magasins;
    }

    @PostMapping
    public  void create(Magasin magasin){
        magasins.add(magasin);
    }

}
