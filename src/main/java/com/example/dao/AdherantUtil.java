package com.example.dao;

import java.sql.*;

import com.example.admin.Adherent;

public class AdherantUtil {
    Connection con;

    public AdherantUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque", "root", "nvmssg12");
    }

    public boolean SupprimerAdherent(int code) throws SQLException {
        Statement st = con.createStatement();
        String query = "DELETE FROM adherents WHERE code = '" + code + "'";
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    public boolean ajouterAdherent(Adherent adherent) throws SQLException {
        Statement st = con.createStatement();
        String query = "INSERT INTO adherents (nom, prenom, code, date) "
                + "VALUES ('" + adherent.getNom() + "', '" + adherent.getPrenom() + "', "
                + adherent.getCode() + ", '" + adherent.getDate() + "')";
        int rs = st.executeUpdate(query);
        return rs > 0;
    }
}
