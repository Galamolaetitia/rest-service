package com.example.restservice.model;

import org.w3c.dom.Text;

import java.sql.Timestamp;

public class Materiel {

    private int materiel_id;
    private String nom;
    private String description;
    private  String marque;
    private String image_url;
    private Taille taille;
    private int duree_location;
    private float cout_location;
    private float cout_remplacement;
    private int categorie_id;
    private Timestamp update_at;


    public Materiel(int materiel_id, String nom, String description, String marque, String image_url, Taille taille, int duree_location, float cout_location, float cout_remplacement, int categorie_id, Timestamp update_at) {
        this.materiel_id = materiel_id;
        this.nom = nom;
        this.description = description;
        this.marque = marque;
        this.image_url = image_url;
        this.taille = taille;
        this.duree_location = duree_location;
        this.cout_location = cout_location;
        this.cout_remplacement = cout_remplacement;
        this.categorie_id = categorie_id;
        this.update_at = update_at;
    }

    public int getMateriel_id() {
        return materiel_id;
    }

    public void setMateriel_id(int materiel_id) {
        this.materiel_id = materiel_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public int getDuree_location() {
        return duree_location;
    }

    public void setDuree_location(int duree_location) {
        this.duree_location = duree_location;
    }

    public float getCout_location() {
        return cout_location;
    }

    public void setCout_location(float cout_location) {
        this.cout_location = cout_location;
    }

    public float getCout_remplacement() {
        return cout_remplacement;
    }

    public void setCout_remplacement(float cout_remplacement) {
        this.cout_remplacement = cout_remplacement;
    }

    public int getCategorie_id() {
        return categorie_id;
    }

    public void setCategorie_id(int categorie_id) {
        this.categorie_id = categorie_id;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }
}
