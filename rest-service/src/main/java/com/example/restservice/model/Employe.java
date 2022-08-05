package com.example.restservice.model;

import java.sql.Timestamp;

public class Employe {
    private int employe_id;
    private String nom;
    private String prenom;
    private String image_url;
    private String email;
    private String login;
    private String mdp;
    private Boolean actif;
    private int magasin_id;
    private Timestamp update_at;

    public Employe(int employe_id, String nom, String prenom, String image_url, String email, String login, String mdp, Boolean actif, int magasin_id, Timestamp update_at) {
        this.employe_id = employe_id;
        this.nom = nom;
        this.prenom = prenom;
        this.image_url = image_url;
        this.email = email;
        this.login = login;
        this.mdp = mdp;
        this.actif = actif;
        this.magasin_id = magasin_id;
        this.update_at = update_at;
    }

    public int getEmploye_id() {
        return employe_id;
    }

    public void setEmploye_id(int employe_id) {
        this.employe_id = employe_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
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
}
