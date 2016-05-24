package com.GAPP.bdd;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sauverEnBase("Alexis", "alexis");
	}
	public static void sauverEnBase(String login, String password){
		// Information d'accès à la base de donnéees
		System.out.println("eee");
		String URL = "jdbc:mysql://localhost:3306/gapp";
		System.out.println("eee1");
		String log = "admin";
		String passwd = "admin";
		Connection cn =null;
		Statement st =null;
		try{
			//Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("eee2");
			//Etape 2 : Récupération de la connexion
			cn = (Connection) DriverManager.getConnection(URL, log, passwd);
			System.out.println("eee3");
			//Etape 3 : Création d'un statement
			st = (Statement) cn.createStatement();
			System.out.println("eee4");
			String sql = "INSERT INTO `utilisateur`(`login`) VALUES (login,password)";
			//Etape 4 : execution requête
			st.executeUpdate(sql);
			System.out.println("eee5");
		   } catch (SQLException e){
			   System.out.println("eee6");
			   e.printStackTrace();
		   } catch (ClassNotFoundException e){
			   System.out.println("eee7");
			   e.printStackTrace();
		   } finally {
			   try {
				   //Etape 5 : Libérer ressources de la mémoire.
				   cn.close();
				   st.close();
				   
			   } catch (SQLException e) {
				   e.printStackTrace();
			   }
		   }
		

	}

}
