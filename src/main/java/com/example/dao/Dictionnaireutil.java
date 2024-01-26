package com.example.dao;

import java.sql.*;
import java.util.LinkedList;

import com.example.documents.Dictionnaire;

public class Dictionnaireutil {
    Connection con;

    public Dictionnaireutil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque", "root", "nvmssg12");
    }

    public LinkedList<Dictionnaire> getDictionnaireByEditeur(String editeur) throws SQLException {
        LinkedList<Dictionnaire> dictionnaires = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from dictionnaire where editeur ='" + editeur + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteurs").split(",");
            for (String s : str) {
                list.add(s);
            }

            Dictionnaire d = new Dictionnaire(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getString("langue"),
                    rs.getInt("nbTomes"));
            dictionnaires.add(d);
        }
        return dictionnaires;
    }

    public LinkedList<Dictionnaire> getDictionnaireByURL(String URL) throws SQLException {
        LinkedList<Dictionnaire> dictionnaires = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from dictionnaire where URL ='" + URL + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteurs").split(",");
            for (String s : str) {
                list.add(s);
            }

            Dictionnaire d = new Dictionnaire(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getString("langue"),
                    rs.getInt("nbTomes"));
            dictionnaires.add(d);
        }
        return dictionnaires;
    }

    public LinkedList<Dictionnaire> getDictionnaireByISBN(String ISBN) throws SQLException {
        LinkedList<Dictionnaire> dictionnaires = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from dictionnaire where ISBN ='" + ISBN + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteurs").split(",");
            for (String s : str) {
                list.add(s);
            }

            Dictionnaire d = new Dictionnaire(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getString("langue"),
                    rs.getInt("nbTomes"));
            dictionnaires.add(d);
        }
        return dictionnaires;
    }

    public LinkedList<Dictionnaire> getDictionnaireByTitre(String titre) throws SQLException {
        LinkedList<Dictionnaire> dictionnaires = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from dictionnaire where titre ='" + titre + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteurs").split(",");
            for (String s : str) {
                list.add(s);
            }

            Dictionnaire d = new Dictionnaire(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getString("langue"),
                    rs.getInt("nbTomes"));
            dictionnaires.add(d);
        }
        return dictionnaires;
    }

    public LinkedList<Dictionnaire> getDictionnaireByLangue(String langue) throws SQLException {
        LinkedList<Dictionnaire> dictionnaires = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from dictionnaire where langue ='" + langue + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteurs").split(",");
            for (String s : str) {
                list.add(s);
            }

            Dictionnaire d = new Dictionnaire(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getString("langue"),
                    rs.getInt("nbTomes"));
            dictionnaires.add(d);
        }
        return dictionnaires;
    }

    public LinkedList<Dictionnaire> getDictionnaireByAnnee_Editon(String annee_edition) throws SQLException {
        LinkedList<Dictionnaire> dictionnaires = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from dictionnaire where annee_edition ='" + annee_edition + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteurs").split(",");
            for (String s : str) {
                list.add(s);
            }

            Dictionnaire d = new Dictionnaire(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getString("langue"),
                    rs.getInt("nbTomes"));
            dictionnaires.add(d);
        }
        return dictionnaires;
    }

    public LinkedList<Dictionnaire> getDictionnaireByNbTomes(int nbTomes) throws SQLException {
        LinkedList<Dictionnaire> dictionnaires = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from dictionnaire where nbTomes =" + nbTomes + ";";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteurs").split(",");
            for (String s : str) {
                list.add(s);
            }

            Dictionnaire d = new Dictionnaire(
                    rs.getString("ISBN"),
                    rs.getString("titre"),
                    list,
                    rs.getString("editeur"),
                    rs.getString("annee_edition"),
                    rs.getString("URL"),
                    rs.getString("langue"),
                    rs.getInt("nbTomes"));
            dictionnaires.add(d);
        }
        return dictionnaires;
    }

    public boolean SupprimerDictionnaire(Dictionnaire d) throws SQLException {
        Statement st = con.createStatement();
        String query = "delete from dictionnaire where ISBN ='" + d.getISBN() + "'";
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    public boolean AjouterDictionnaire(Dictionnaire d) throws SQLException {
        Statement st = con.createStatement();
        String query = "INSERT INTO dictionnaire (ISBN, titre, tableau_auteurs, editeur, annee_edition, URL, langue, nbTomes) "
                +
                "VALUES ('" + d.getISBN() + "', '" + d.getTitre() + "', '" + listToString(d.getTableau_auteurs())
                + "', '" +
                d.getEditeur() + "', '" + d.getAnnee_edition() + "', '" + d.getURL() + "', '" + d.getLangue() + "', " +
                d.getNbTomes() + ")";
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
