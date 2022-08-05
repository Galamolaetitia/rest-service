package com.example.restservice.model;

import java.sql.Timestamp;

public class Categorie {

    private int categorie_id;
    private String nom;
    private Timestamp update_at;

    public Categorie(int categorie_id, String nom, Timestamp update_at) {
        this.categorie_id = categorie_id;
        this.nom = nom;
        this.update_at = update_at;
    }

    public int getCategorie_id() {
        return categorie_id;
    }

    public void setCategorie_id(int categorie_id) {
        this.categorie_id = categorie_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }
}
