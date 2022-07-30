package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.beans.Utilisateurs;

public class UtilisateurDao implements UtilisateurDaoInterface {
    private DaoFactory daoFactory;

    UtilisateurDao(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public void ajouter(Utilisateurs utilisateur) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;

        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("INSERT INTO users(login, password, nom, prenom) VALUES(?, ?, ?, ?);");
            preparedStatement.setString(1, utilisateur.getLogin());
            preparedStatement.setString(2, utilisateur.getPassword());
            preparedStatement.setString(3, utilisateur.getNom());
            preparedStatement.setString(4, utilisateur.getPrenom());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Utilisateurs> lister() {
        List<Utilisateurs> utilisateurs = new ArrayList<Utilisateurs>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT nom, prenom FROM noms;");

            while (resultat.next()) {
                String nom = resultat.getString("nom");
                String prenom = resultat.getString("prenom");

                Utilisateurs utilisateur = new Utilisateurs();
                utilisateur.setNom(nom);
                utilisateur.setPrenom(prenom);

                utilisateurs.add(utilisateur);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return utilisateurs;
    }
    
    @Override
    public boolean isUser(String login, String password) {
    	
    	Connection connexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultat = null ;
        boolean r = false ;

        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("SELECT login, password FROM users WHERE login = ? AND password = ?;");
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            resultat = preparedStatement.executeQuery();
            if(resultat.next()) {
            	r = true ;
            }
            else {
            	r = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return r;  	
    }

}