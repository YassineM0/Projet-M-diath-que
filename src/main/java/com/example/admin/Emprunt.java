package com.example.admin;

import com.example.documents.Document;

public class Emprunt {
    int codeEmprunt;
    Document document;
    String dateEmprunt;
    static int nbEmprunt = 0;
    public Emprunt(int codeEmprunt, Document document, String dateEmprunt) {
        this.codeEmprunt = codeEmprunt;
        this.document = document;
        this.dateEmprunt = dateEmprunt;
    }
    @Override
    public String toString() {
        return super.toString() + "Emprunt [codeEmprunt=" + codeEmprunt + ", document=" + document + ", dateEmprunt=" + dateEmprunt + "]";
    }

    
}
