package com.example.dao;

import java.sql.*;
import java.util.LinkedList;
import com.example.documents.*;

public class Livreutil {
    Connection con;

    public Livreutil() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediatheque", "root", "nvmssg12");
    }

    public LinkedList<Livre> getLivreByEditeur(String editeur) throws SQLException {
        LinkedList<Livre> livres = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from livres where editeur ='" + editeur + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteur").split(",");
            for (String s : str) {
                list.add(s);
            }

            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"), list, rs.getString("editeur"),
                    rs.getString("annee_edition"), rs.getString("URL"), rs.getInt("nbPages"), rs.getInt("tome"),
                    rs.getString("annee_edition"));
            livres.add(l);
        }
        return livres;
    }

    public LinkedList<Livre> getLivreByISBN(String ISBN) throws SQLException {
        LinkedList<Livre> livres = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from livres where ISBN ='" + ISBN + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteur").split(",");
            for (String s : str) {
                list.add(s);
            }

            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"), list, rs.getString("editeur"),
                    rs.getString("annee_edition"), rs.getString("URL"), rs.getInt("nbPages"), rs.getInt("tome"),
                    rs.getString("annee_edition"));
            livres.add(l);
        }
        System.out.println(livres.size() + "zaddz");
        return livres;
    }

    public LinkedList<Livre> getLivreByTableauAuteur(String auteur) throws SQLException {
        LinkedList<Livre> livres = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from livres;";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"), StringToList(rs.getString("auteurs")),
                    rs.getString("editeur"),
                    rs.getString("annee_edition"), rs.getString("URL"), rs.getInt("nbPages"), rs.getInt("tome"),
                    rs.getString("annee_edition"));
            for (String s : l.getTableau_auteurs()) {
                if (s == auteur) {
                    livres.add(l);
                    break;
                }
            }
        }
        return livres;
    }

    public LinkedList<Livre> getLivreByTitre(String titre) throws SQLException {
        LinkedList<Livre> livres = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from livres where titre ='" + titre + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteur").split(",");
            for (String s : str) {
                list.add(s);
            }

            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"), list, rs.getString("editeur"),
                    rs.getString("annee_edition"), rs.getString("URL"), rs.getInt("nbPages"), rs.getInt("tome"),
                    rs.getString("annee_edition"));
            livres.add(l);
        }
        return livres;
    }

    public LinkedList<Livre> getLivreByAnneeEdition(String annee_edition) throws SQLException {
        LinkedList<Livre> livres = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from livres where annee_edition ='" + annee_edition + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteur").split(",");
            for (String s : str) {
                list.add(s);
            }

            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"), list, rs.getString("editeur"),
                    rs.getString("annee_edition"), rs.getString("URL"), rs.getInt("nbPages"), rs.getInt("tome"),
                    rs.getString("annee_edition"));
            livres.add(l);
        }
        return livres;
    }

    public LinkedList<Livre> getLivreByURL(String URL) throws SQLException {
        LinkedList<Livre> livres = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from livres where URL ='" + URL + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteur").split(",");
            for (String s : str) {
                list.add(s);
            }

            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"), list, rs.getString("editeur"),
                    rs.getString("annee_edition"), rs.getString("URL"), rs.getInt("nbPages"), rs.getInt("tome"),
                    rs.getString("annee_edition"));
            livres.add(l);
        }
        return livres;
    }

    public LinkedList<Livre> getLivreByNbPages(int nbPages) throws SQLException {
        LinkedList<Livre> livres = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from livres where nbPages ='" + nbPages + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteur").split(",");
            for (String s : str) {
                list.add(s);
            }

            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"), list, rs.getString("editeur"),
                    rs.getString("annee_edition"), rs.getString("URL"), rs.getInt("nbPages"), rs.getInt("tome"),
                    rs.getString("annee_edition"));
            livres.add(l);
        }
        return livres;
    }

    public LinkedList<Livre> getLivreByTome(int tome) throws SQLException {
        LinkedList<Livre> livres = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from livres where tome ='" + tome + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteur").split(",");
            for (String s : str) {
                list.add(s);
            }

            Livre l = new Livre(rs.getString("ISBN"), rs.getString("titre"), list, rs.getString("editeur"),
                    rs.getString("annee_edition"), rs.getString("URL"), rs.getInt("nbPages"), rs.getInt("tome"),
                    rs.getString("annee_edition"));
            livres.add(l);
        }
        return livres;
    }

    public LinkedList<Livre> getLivreByType(String type) throws SQLException {
        LinkedList<Livre> livres = new LinkedList<>();
        Statement st = con.createStatement();
        String query = "select * from livres where type ='" + type + "';";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            LinkedList<String> list = new LinkedList<>();
            String[] str = rs.getString("tableau_auteur").split(",");
            for (String s : str) {
                list.add(s);
            }

            Livre l = new Livre(rs.getString("ISBN"), rs.getString("nbPages"), list, rs.getString("editeur"),
                    rs.getString("annee_edition"), rs.getString("URL"), rs.getInt("nbPages"), rs.getInt("tome"),
                    rs.getString("annee_edition"));
            livres.add(l);
        }
        return livres;
    }

    public Boolean SupprimerLivre(String i) throws SQLException {
        Statement st = con.createStatement();
        String query = "delete from livres where ISBN ='" + i + "' ";
        int rs = st.executeUpdate(query);
        return rs > 0;
    }

    public boolean AjouterLivre(Livre l) throws SQLException {
        Statement st = con.createStatement();
        String query = "INSERT INTO livres (ISBN, titre, tableau_auteur, editeur, annee_edition, URL, nbPages, tome, type) "
                +
                "VALUES ('" + l.getISBN() + "', '" + l.getTitre() + "', '" + listToString(l.getTableau_auteurs())
                + "', '" +
                l.getEditeur() + "', '" + l.getAnnee_edition() + "', '" + l.getURL() + "', " +
                l.getNbPages() + ", " + l.getTome() + ", '" + l.getType() + "')";
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
