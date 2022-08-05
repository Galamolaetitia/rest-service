package com.example.restservice.model;

import java.sql.Timestamp;

public class Inventaire {
    private int inventaire_id;
    private int materiel_id;
    private int magasin_id;
    private Timestamp update_at;

    public int getInventaire_id() {
        return inventaire_id;
    }

    public void setInventaire_id(int inventaire_id) {
        this.inventaire_id = inventaire_id;
    }

    public int getMateriel_id() {
        return materiel_id;
    }

    public void setMateriel_id(int materiel_id) {
        this.materiel_id = materiel_id;
    }

    public int getMagasin_id() {
        return magasin_id;
    }

    public void setMagasin_id(int magasin_id) {
        this.magasin_id = magasin_id;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }

    public Inventaire(int inventaire_id, int materiel_id, int magasin_id, Timestamp update_at) {
        this.inventaire_id = inventaire_id;
        this.materiel_id = materiel_id;
        this.magasin_id = magasin_id;
        this.update_at = update_at;
    }
}
