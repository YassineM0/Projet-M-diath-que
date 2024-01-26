package com.example.dao;

import java.sql.*;
import java.util.Arrays;
import java.util.LinkedList;
import com.example.documents.*;

public class MagazineUtil {
    Connection con;

    public MagazineUtil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque", "root", "nvmssg12");
    }

    public LinkedList<Magazine> getMagazineByISBN(String ISBN) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from magazine where ISBN ='" + ISBN + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteurs").split(",");
            for (String s : str) {
                list.add(s);
            }

            Magazine m = new Magazine(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    StringToList(rs.getString("tableau_auteurs")),
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getInt("periodicite"),
                    rs.getString("moisEdition"),
                    rs.getString("jour"));
            magazines.add(m);
        }
        System.out.println(magazines.size());
        return magazines;
    }

    public LinkedList<Magazine> getMagazineByTitre(String titre) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "SELECT * FROM magazine WHERE titre = '" + titre + "';";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>(Arrays.asList(rs.getString("tableau_auteurs").split(",")));
            Magazine m = new Magazine(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getInt("periodicite"),
                    rs.getString("moisEdition"),
                    rs.getString("jour"));
            magazines.add(m);
        }

        return magazines;
    }

    public LinkedList<Magazine> getMagazineByTableauAuteur(String auteur) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from magazine;";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>(Arrays.asList(rs.getString("tableau_auteurs").split(",")));
            Magazine m = new Magazine(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getInt("periodicite"),
                    rs.getString("moisEdition"),
                    rs.getString("jour"));
            magazines.add(m);
        }

        return magazines;
    }

    public LinkedList<Magazine> getMagazineByEditeur(String editeur) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "SELECT * FROM magazine WHERE editeur = '" + editeur + "';";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>(Arrays.asList(rs.getString("tableau_auteurs").split(",")));
            Magazine m = new Magazine(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getInt("periodicite"),
                    rs.getString("moisEdition"),
                    rs.getString("jour"));
            magazines.add(m);
        }

        return magazines;
    }

    public LinkedList<Magazine> getMagazineByAnneeEdition(String anneeEdition) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "SELECT * FROM magazine WHERE annee_edition = '" + anneeEdition + "';";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>(Arrays.asList(rs.getString("tableau_auteurs").split(",")));
            Magazine m = new Magazine(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getInt("periodicite"),
                    rs.getString("moisEdition"),
                    rs.getString("jour"));
            magazines.add(m);
        }

        return magazines;
    }

    public LinkedList<Magazine> getMagazineByJour(String jour) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "SELECT * FROM magazine WHERE jour = '" + jour + "';";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>(Arrays.asList(rs.getString("tableau_auteurs").split(",")));
            Magazine m = new Magazine(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getInt("periodicite"),
                    rs.getString("moisEdition"),
                    rs.getString("jour"));
            magazines.add(m);
        }

        return magazines;
    }

    public LinkedList<Magazine> getMagazineByURL(String URL) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "SELECT * FROM magazine WHERE URL = '" + URL + "';";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>(Arrays.asList(rs.getString("tableau_auteurs").split(",")));
            Magazine m = new Magazine(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getInt("periodicite"),
                    rs.getString("moisEdition"),
                    rs.getString("jour"));
            magazines.add(m);
        }

        return magazines;
    }

    public LinkedList<Magazine> getMagazineByPeriodicite(int periodicite) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "SELECT * FROM magazine WHERE periodicite = " + periodicite + ";";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>(Arrays.asList(rs.getString("tableau_auteurs").split(",")));
            Magazine m = new Magazine(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getInt("periodicite"),
                    rs.getString("moisEdition"),
                    rs.getString("jour"));
            magazines.add(m);
        }

        return magazines;
    }

    public LinkedList<Magazine> getMagazineByMoisEdition(String moisEdition) throws SQLException {
        LinkedList<Magazine> magazines = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "SELECT * FROM magazine WHERE moisEdition = '" + moisEdition + "';";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>(Arrays.asList(rs.getString("tableau_auteurs").split(",")));
            Magazine m = new Magazine(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getInt("periodicite"),
                    rs.getString("moisEdition"),
                    rs.getString("jour"));
            magazines.add(m);
        }

        return magazines;
    }

    public boolean SupprimerMagazine(Magazine m) throws SQLException {
        Statement st = con.createStatement();
        String query = "DELETE FROM magazines WHERE ISSN = '" + m.getISBN() + "'";
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    public boolean AjouterMagazine(Magazine m) throws SQLException {
        Statement st = con.createStatement();
        String query = "INSERT INTO magazines (ISSN, titre, tableau_auteur, editeur, annee_edition, URL, periodicite, moisEdition, jour) "
                + "VALUES ('" + m.getISBN() + "', '" + m.getTitre() + "', '" + listToString(m.getTableau_auteurs())
                + "', '" + m.getEditeur() + "', '" + m.getAnnee_edition() + "', '" + m.getURL() + "', "
                + m.getPeriodicite() + ", '" + m.getMoisEdition() + "', '" + m.getJour() + "')";
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    public String listToString(LinkedList<String> list) {
        String result = "";
        for (String str : list) {
            result += str;
            result += ',';
        }
        if (result.length() > 0)
            return result.substring(0, result.length() - 1);
        return "";
    }

    public static LinkedList<String> StringToList(String s) {
        LinkedList<String> result = new LinkedList<>();
        String[] str = s.split(",");
        for (String ss : str) {
            result.add(ss);
        }
        return result;
    }
}
