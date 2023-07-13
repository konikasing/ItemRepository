<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Create New Items</h1>

    <form action="saveReg" method="POST">
    	<pre>
	        name<input type="text" name="name">
	        category<input type="text" name="category">
	        quantity<input type="text" name="quantity">
	        status<input type="text" name="status">
	        <input type="submit" value="save"/>
	        
        </pre> 
    </form>
 
</body>
</html>