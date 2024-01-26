package com.example.documents;

import java.util.LinkedList;

public class Dictionnaire extends Document {
    private String langue;
    private int nbTomes;

    public Dictionnaire(String iSBN, String titre, LinkedList<String> tableau_auteurs, String editeur,
            String annee_edition, String uRL, String langue, int nbTomes) {
        super(iSBN, titre, tableau_auteurs, editeur, annee_edition, uRL);
        this.langue = langue;
        this.nbTomes = nbTomes;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public int getNbTomes() {
        return nbTomes;
    }

    public void setNbTomes(int nbTomes) {
        this.nbTomes = nbTomes;
    }

    @Override
    public String toString() {
        return super.toString() + "Dictionnaire [langue=" + langue + ", nbTomes=" + nbTomes + "]";
    }

}
