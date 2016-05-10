package com.GAPP.bdd;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sauverEnBase("Momo");
	}
	public static void sauverEnBase(String login){
		// Information d'accès à la base de donnéees
		String url = "jdbc:mysql://localhost";
		String login1 = "admin";
		String passwd = "1234";
		Connection cn =null;
		Statement st =null;
		try{
			//Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			//Etape 2 : Récupération de la connexion
			cn = (Connection) DriverManager.getConnection(url, login1, passwd);
			//Etape 3 : Création d'un statement
			st = (Statement) cn.createStatement();
			String sql = "INSERT INTO 'utilisateur' ('login') VALUES ('"+ login +"')";
			//Etape 4 : execution requête
			st.executeUpdate(sql);
			
		   } catch (SQLException e){
			   e.printStackTrace();
		   } catch (ClassNotFoundException e){
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
