<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Old</title>
</head>
<body>

	<jsp:useBean id="users" type="com.GAPP.bdd.Etudiant" scope="request"/>
	<p>Vous êtes vieux ! </p>
	<label>Login : </label><jsp:getProperty property="login" name="users"/><br/>
	<label>Mdp :</label><jsp:getProperty property="mdp" name="users"/><br/>
	<label>Email :</label><jsp:getProperty property="mail" name="users"/><br/>
	<label>Sexe : </label><jsp:getProperty property="sex" name="users"/><br/>
	<label>Anniversaire :</label><jsp:getProperty property="birthDay" name="users"/><br/>

  
</body>
</html>