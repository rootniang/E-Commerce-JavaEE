package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {
	private String username ;
	private String password ;
	private String url ;
	
	DaoFactory(String url, String username, String password) {
		this.url = url ;
		this.username = username ;
		this.password = password ;
	}
	
	public static DaoFactory getInstance() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		DaoFactory instance = new DaoFactory("jdbc:mysql://localhost:3306/jaaba_store","root","");
		return instance ;
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
	
	 // Récupération du Dao
    public UtilisateurDaoInterface getUtilisateurDao() {
        return new UtilisateurDao(this);
    }
	

}
