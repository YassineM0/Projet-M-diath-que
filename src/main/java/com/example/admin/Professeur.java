package com.example.admin;

public class Professeur extends Personne{
    private String cin;

    public Professeur(String nom, String prenom, String cin) {
        super(nom, prenom);
        this.cin = cin;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
    
}
