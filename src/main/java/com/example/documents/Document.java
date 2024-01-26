package com.example.documents;

import java.util.LinkedList;

public abstract class Document {
    final String ISBN;
    private String titre;
    private LinkedList<String> tableau_auteurs;
    private String editeur;
    private String annee_edition;
    private String URL;

    public Document(String iSBN, String titre, LinkedList<String> tableau_auteurs, String editeur, String annee_edition,
            String uRL) {
        this.ISBN = iSBN;
        this.titre = titre;
        this.tableau_auteurs = tableau_auteurs;
        this.editeur = editeur;
        this.annee_edition = annee_edition;
        this.URL = uRL;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public LinkedList<String> getTableau_auteurs() {
        return tableau_auteurs;
    }

    public String getEditeur() {
        return editeur;
    }

    public String getAnnee_edition() {
        return annee_edition;
    }

    public String getURL() {
        return URL;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setTableau_auteurs(LinkedList<String> tableau_auteurs) {
        this.tableau_auteurs = tableau_auteurs;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public void setAnnee_edition(String annee_edition) {
        this.annee_edition = annee_edition;
    }

    public void setURL(String uRL) {
        this.URL = uRL;
    }

    @Override
    public String toString() {
        return "Document [ISBN=" + ISBN + ", titre=" + titre + ", tableau_auteurs=" + tableau_auteurs + ", editeur="
                + editeur + ", annee_edition=" + annee_edition + ", URL=" + URL + "]";
    }

}
