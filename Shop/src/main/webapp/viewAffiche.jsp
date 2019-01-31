<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p><%= new java.util.Date() %> </p>

	<p>
		<%
// 			 String param = (String) request.getAttribute("leNom");
// 			String param2 = (String) request.getAttribute("ladresse");
// 			out.println(param.toUpperCase());
// 			out.println(param2); 
			
			String paramClient = (String) request.getAttribute("donneesClients");
			out.println(paramClient);
			
			String livrai = (String) request.getAttribute("livraison");
			out.println(livrai);
			
			String fac = (String) request.getAttribute("facture");
			out.println(fac);
// 			String paramAll = (String) request.getAttribute("fullinfo");		
// 			out.println(paramAll);
		%>
	</p>

</body>
</html>