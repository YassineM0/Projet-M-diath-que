package com.example.exemples;
import java.util.LinkedList;

import com.example.documents.Dictionnaire;

public class DictionnaireBilingue extends Dictionnaire{
    private Boolean aDesExemples;

    public DictionnaireBilingue(String iSBN, String titre, LinkedList<String> tableau_auteurs, String editeur,
            String annee_edition, String uRL, String langue, int nbTomes, Boolean aDesExemples) {
        super(iSBN, titre, tableau_auteurs, editeur, annee_edition, uRL, langue, nbTomes);
        this.aDesExemples = aDesExemples;
    }

    public Boolean getaDesExemples() {
        return aDesExemples;
    }

    public void setaDesExemples(Boolean aDesExemples) {
        this.aDesExemples = aDesExemples;
    }

    @Override
    public String toString() {
        return super.toString() + "DictionnaireBilingue [aDesExemples=" + aDesExemples + "]";
    }
    
}
