package com.example.documents;

import java.util.LinkedList;

public class Magazine extends Document {
    private int periodicite;
    private String moisEdition;
    private String jour;

    public Magazine(String iSBN, String titre, LinkedList<String> tableau_auteurs, String editeur, String annee_edition,
            String uRL, int periodicite, String moisEdition, String jour) {
        super(iSBN, titre, tableau_auteurs, editeur, annee_edition, uRL);
        this.periodicite = periodicite;
        this.moisEdition = moisEdition;
        this.jour = jour;
    }

    public int getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(int periodicite) {
        this.periodicite = periodicite;
    }

    public String getMoisEdition() {
        return moisEdition;
    }

    public void setMoisEdition(String moisEdition) {
        this.moisEdition = moisEdition;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    @Override
    public String toString() {
        return super.toString() + "Magazine [periodicite=" + periodicite + ", moisEdition=" + moisEdition + ", jour="
                + jour + "]";
    }

}
