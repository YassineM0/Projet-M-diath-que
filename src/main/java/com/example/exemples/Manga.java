package com.example.exemples;
import java.util.LinkedList;

import com.example.documents.Livre;

public class Manga extends Livre {
    private String univer;

    public Manga(String iSBN, String titre, LinkedList<String> tableau_auteurs, String editeur, String annee_edition,
            String uRL, int nbPages, int tome, String type, String univer) {
        super(iSBN, titre, tableau_auteurs, editeur, annee_edition, uRL, nbPages, tome, type);
        this.univer = univer;
    }

    public String getUniver() {
        return univer;
    }

    public void setUniver(String univer) {
        this.univer = univer;
    }

    @Override
    public String toString() {
        return super.toString() + "Manga [univer=" + univer + "]";
    }
    
}
