package com.example.exemples;

import java.util.LinkedList;

import com.example.documents.Magazine;


public class BandeDessinee extends Magazine {
    private Boolean estEnCouleur;

    public BandeDessinee(String iSBN, String titre, LinkedList<String> tableau_auteurs, String editeur,
            String annee_edition, String uRL, int periodicite, String moisEdition, String jour, Boolean estEnCouleur) {
        super(iSBN, titre, tableau_auteurs, editeur, annee_edition, uRL, periodicite, moisEdition, jour);
        this.estEnCouleur = estEnCouleur;
    }

    public Boolean getEstEnCouleur() {
        return estEnCouleur;
    }

    public void setEstEnCouleur(Boolean estEnCouleur) {
        this.estEnCouleur = estEnCouleur;
    }

    @Override
    public String toString() {
        return super.toString() + "BandeDessinee [estEnCouleur=" + estEnCouleur + "]";
    }
    
}
