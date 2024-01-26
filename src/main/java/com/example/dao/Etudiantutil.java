package com.example.dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

import com.example.admin.Etudiant;

public class Etudiantutil {
    Connection con;

    public Etudiantutil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque", "root", "nvmssg12");
    }

    public LinkedList<Etudiant> getEtudiantByCNE(String cne) throws SQLException {
        LinkedList<Etudiant> etudiants = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from etudiant where cne = '" + cne + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Etudiant e = new Etudiant(rs.getString("nom"), rs.getString("prenom"), rs.getString("cne"));
            etudiants.add(e);
        }
        return etudiants;
    }
    public Boolean SuprimerEtudiant(Etudiant e) throws SQLException {
        Statement st = con.createStatement();
        String query = "delete from etudiants where nom ='"+e.getNom()+"' and prenom ='"+e.getPrenom()+"' and cne ='"+e.getCne();
        int rs = st.executeUpdate(query);
        return rs>0;
    }
}
