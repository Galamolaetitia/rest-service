package com.example.restservice.controller;

import com.example.restservice.model.Employe;
import com.example.restservice.model.Inventaire;
import com.example.restservice.model.Materiel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class InventaireController {
    //creation,modification,suppression des inventaires

    private List <Inventaire> inventaires;


    public List <Inventaire> getAllInventaires(){
        return inventaires;
    }

    @PostMapping
    public  void create(Inventaire inventaire){
        inventaires.add(inventaire);
    }

    @PutMapping("/{inventaire_id}")
    public void update(Inventaire inventaire, int id){
        //update an existing one
        for(int i = 0; i < inventaires.size(); i++) {

            Inventaire inventairei=inventaires.get(i);
            if(inventairei.getInventaire_id()==id){
                    inventaires.set(i,inventaire);
                    return;
            }

        }

    }

    @DeleteMapping("/{inventaire_id}")
    public  void delete(@PathVariable Integer inventaire_id){

        for(int i = 0; i < inventaires.size(); i++) {

            Inventaire inventairei=inventaires.get(i);
            if(inventairei.getInventaire_id()==inventaire_id){
                inventaires.remove(inventairei);
                return;
            }

        }

    }


}
