package com.example.documents;

import java.util.LinkedList;

public class Livre extends Document {
    private int nbPages;
    private int tome;
    private String type;

    public Livre(String iSBN, String titre, LinkedList<String> tableau_auteurs, String editeur, String annee_edition,
            String uRL, int nbPages, int tome, String type) {
        super(iSBN, titre, tableau_auteurs, editeur, annee_edition, uRL);
        this.nbPages = nbPages;
        this.tome = tome;
        this.type = type;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public int getTome() {
        return tome;
    }

    public void setTome(int tome) {
        this.tome = tome;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    @Override
    public String toString() {
        return toString() + "Livre [nbPages=" + nbPages + ", tome=" + tome + ", type=" + type + "]";
    }

}
