<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2> Update Item  </h2>
	
	<form action="editReg" method="post">
	
	<pre>
		<input type="hidden" name="id" value="${leads.id}"/>
		name<input type ="text" name ="name" value= "${item.name}"/>
		category<input type ="text" name="category" value= "${item.category}"/>
		quantity<input type= "text" name="quantity" value= "${item.quantity}"/>
		status<input type="text" name="status" value= "${item.status}"/>
		<input type="submit" value ="update"/>
	</pre>
	</form>	
	${msz}
	
</body>
</html>