package com.example.restservice.model;

import java.sql.Timestamp;

public class Magasin {
    private int inventaire_id;
    private String ville;
    private int directeur_personnel_id;
    private Timestamp update_at;

    public int getInventaire_id() {
        return inventaire_id;
    }

    public void setInventaire_id(int inventaire_id) {
        this.inventaire_id = inventaire_id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getDirecteur_personnel_id() {
        return directeur_personnel_id;
    }

    public void setDirecteur_personnel_id(int directeur_personnel_id) {
        this.directeur_personnel_id = directeur_personnel_id;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }

    public Magasin(int inventaire_id, String ville, int directeur_personnel_id, Timestamp update_at) {
        this.inventaire_id = inventaire_id;
        this.ville = ville;
        this.directeur_personnel_id = directeur_personnel_id;
        this.update_at = update_at;
    }
}
