package com.example.admin;

import java.util.LinkedList;

import com.example.documents.Document;

public class Kindle {
    private String numeroSerie;
    private int capaciteStockage;
    private LinkedList<Document> livresTelecharges;
    public Kindle(String numeroSerie, int capaciteStockage) {
        this.numeroSerie = numeroSerie;
        this.capaciteStockage = capaciteStockage;
        this.livresTelecharges = new LinkedList<>();
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public int getCapaciteStockage() {
        return capaciteStockage;
    }
    public void setCapaciteStockage(int capaciteStockage) {
        this.capaciteStockage = capaciteStockage;
    }
    public LinkedList<Document> getLivresTelecharges() {
        return livresTelecharges;
    }
    public void setLivresTelecharges(LinkedList<Document> livresTelecharges) {
        this.livresTelecharges = livresTelecharges;
    }
    
}
