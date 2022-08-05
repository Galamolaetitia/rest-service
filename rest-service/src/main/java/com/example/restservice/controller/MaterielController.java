package com.example.restservice.controller;

import com.example.restservice.model.Employe;
import com.example.restservice.model.Inventaire;
import com.example.restservice.model.Materiel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class MaterielController {
    //creation,modification,suppression du materiel
    private List <Materiel> materiels;


    public List <Materiel> getAllMateriel(){
        return materiels;
    }

   // @Override
    public void affichage() {

        for(int i = 0; i < materiels.size(); i++)
        {
            //System.out.println (materiel);
        }
    }

    @PostMapping
    public  void create(Materiel materiel){
        materiels.add(materiel);
    }

    @PutMapping("/{materiel_id}")
    public void update(Materiel materiel, int id){
        //update an existing one
        for(int i = 0; i < materiels.size(); i++) {

            Materiel materieli=materiels.get(i);

            if(materieli.getMateriel_id()==id) {

                materiels.set(i, materiel);

                return;
            }
        }

    }

    @DeleteMapping("/{materiel_id}")
    public  void delete(@PathVariable int materiel_id){

        for(int i = 0; i < materiels.size(); i++) {

            Materiel materieli=materiels.get(i);

            if(materieli.getMateriel_id()==materiel_id) {

                materiels.remove(materieli);

                return;
            }
        }


    }

}
