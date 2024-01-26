package com.example.admin;

public class Adherent extends Personne{
    private int code;
    private String date;
    static int nbAdherents = 0;
    public Adherent(String nom, String prenom, int code, String date) {
        super(nom, prenom);
        this.code = code;
        this.date = date;
    }
    public Adherent(String nom, String prenom, int code) {
        super(nom, prenom);
        this.code = code;
    }
    @Override
    public String toString() {
        return super.toString()+ "Adherent [code=" + code + ", date=" + date + "]";
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public static int getNbAdherents() {
        return nbAdherents;
    }
    public static void setNbAdherents(int nbAdherents) {
        Adherent.nbAdherents = nbAdherents;
    }
    
    
}
