<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="css/stile.css">
<script type="text/javascript" src="jquery/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrazione</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="js/gestioneForm.js"></script>
</head>
<body>
<form action="registrazione" method="post">
	<table align="center">
	  
		<tr height="50" align="center">
			<th colspan="6" valign="middle">REGISTRAZIONE UTENTE</th>
		</tr>

		<tr height="50" >
			<td width="20%">IdUtente</td>
			<td width="40%"><input type="text" id="idUtente" name="idUtente"></td>
			<td width="40%"><c:forEach items="${lista}" var="errore">
								<c:if test="${errore.campoValidato=='idUtente'}" > ${errore.descrizioneErrore}</c:if>
							</c:forEach>
		</tr>
		
		<tr height="50" >
			<td width="20%">Nome</td>
			<td width="40%"><input type="text" id="nome" name="nome"></td>
			<td width="40%"><c:forEach items="${lista}" var="errore">
								<c:if test="${errore.campoValidato=='nome'}" > ${errore.descrizioneErrore}</c:if>
							</c:forEach>
		</tr>
		<tr height="50" >
			<td width="20%">Username</td>
			<td width="40%"><input type="text" id="username" name="username"></td>
			<td width="40%"><c:forEach items="${lista}" var="errore">
								<c:if test="${errore.campoValidato=='username'}" > ${errore.descrizioneErrore}</c:if>
							</c:forEach>
		</tr>
		<tr height="50" >
			<td width="20%">Password</td>
			<td width="40%"><input type="password" id="password" name="password"></td>
			<td width="40%"><c:forEach items="${lista}" var="errore">
								<c:if test="${errore.campoValidato=='password'}" > ${errore.descrizioneErrore}</c:if>
							</c:forEach>
		</tr>
		
		<tr height="50">
			<th colspan="6" valign="middle"><input type="submit" value="registra" ><br></th>
		</tr>
	</table>
   </form>

</body>
</html>