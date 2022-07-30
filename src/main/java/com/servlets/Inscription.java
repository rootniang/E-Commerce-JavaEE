package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Utilisateurs;
import com.dao.DaoFactory;
import com.dao.UtilisateurDaoInterface;

/**
 * Servlet implementation class Inscription
 */
@WebServlet("/Inscription")
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurDaoInterface utilisateurDao;

    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.utilisateurDao = daoFactory.getUtilisateurDao();
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Utilisateurs utilisateur = new Utilisateurs() ;
		String login = (String)request.getParameter( "login" );
		String password = (String)request.getParameter( "password" );
		String nom = (String)request.getParameter( "nom" );
		String prenom = (String)request.getParameter( "prenom" );
		utilisateur.setLogin(login);
		utilisateur.setPassword(password);
		utilisateur.setNom(nom);
		utilisateur.setPrenom(prenom);
		
		utilisateurDao.ajouter(utilisateur) ;
		HttpSession session = request.getSession();
        session.setAttribute( "user", login);
		
		request.getRequestDispatcher("Catalogue.jsp").forward(request, response);
	}

}
