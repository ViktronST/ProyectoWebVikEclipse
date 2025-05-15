<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <form action="http://localhost:8082/ProyectoWebVik/calculadoraVik" method="GET">
        Numero1: <input type="number" name="num1" id="num1">
        Numero2: <input type="number" name="num2" id="num2">
        <select name="operacion">
            <option value="suma">Sumar</option>
            <option value="resta">Restar</option>
            <option value="multiplica">Multiplicar</option>
            <option value="divide">Dividir</option>
        </select>
        <input type="submit" value="Enviar">
    </form>
    
  	<%
	    int resultado = (int) Integer.parseInt(request.getParameter("resultado"));
		out.println("<p>Resultado: " + resultado + "</p>");  	
  	%>

</body>
</html>