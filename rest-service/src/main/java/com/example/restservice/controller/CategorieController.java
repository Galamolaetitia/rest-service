package com.example.restservice.controller;

import com.example.restservice.model.Categorie;
import com.example.restservice.model.Employe;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class CategorieController {

    private List<Categorie> categories;

    public List <Categorie> getAllCategories(){
        return categories;
    }

    @PostMapping
    public  void create(Categorie categorie){
        categories.add(categorie);
    }
}
