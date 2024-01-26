package com.example;

import java.util.LinkedList;

import com.example.admin.Adherent;
import com.example.admin.Emprunt;
import com.example.admin.Kindle;
import com.example.documents.Document;

public class Mediatheque {
    LinkedList<Document> documents;
    LinkedList<Adherent> adherents;
    LinkedList<Kindle> kindles;
    LinkedList<Emprunt> emprunts;

    public Mediatheque() {
        this.documents = new LinkedList<>();
        this.adherents = new LinkedList<>();
        this.kindles = new LinkedList<>();
        this.emprunts = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "Mediatheque [documents=" + documents + ", adherents=" + adherents + ", kindles=" + kindles
                + ", emprunts=" + emprunts + "]";
    }
    

}
