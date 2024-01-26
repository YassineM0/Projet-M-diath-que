package com.example.dao;

import java.sql.*;
import java.util.LinkedList;

import com.example.admin.Professeur;

public class Professeurutil {
    Connection con;

    public Professeurutil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque", "root", "nvmssg12");
    }

    public LinkedList<Professeur> getProfesseurbyCIN(String cin) throws SQLException {
        LinkedList<Professeur> professeurs = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from etudiant where cin = '" + cin + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Professeur p = new Professeur(rs.getString("nom"), rs.getString("prenom"), rs.getString("cin"));
            professeurs.add(p);
        }
        return professeurs;
    }

    public Boolean SuprimerProfesseur(Professeur p) throws SQLException {
        Statement st = con.createStatement();
        String query = "delete from etudiants where nom ='" + p.getNom() + "' and prenom ='" + p.getPrenom()
                + "' and cin ='" + p.getCin();
        int rs = st.executeUpdate(query);
        return rs > 0;
    }
}
