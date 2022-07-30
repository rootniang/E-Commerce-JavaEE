package com.dao;

import java.util.List;
import com.beans.Utilisateurs;

public interface UtilisateurDaoInterface {
	void ajouter(Utilisateurs utilisateur) ;
	List<Utilisateurs> lister() ;
	boolean isUser(String login, String password) ;
}
