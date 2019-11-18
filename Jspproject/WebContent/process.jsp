<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		int count = 0;
		public int getNumber(){
		return count++;
	}
		
	public void jspInit(){
		System.out.println("Init called");
	}
	
	public void jspDestroy(){
		System.out.println("Destroy called");
	}
	%>
	
	<%
		//int count =0;
		//out.println("count: "+count);
		//out.println("count: "+this.count);
		
	
	
		String str = request.getParameter("txtNumber");
		if(str != null){
			out.println("Parameter value : "+str);
		}
	%>
	
	<p>
		This is HTML p tag
	</p>
	
	Parameter Value using Expression :
	<%=	str %><br>
	
	<% int c = getNumber();
	out.println("Calling method using scriptlet: "+c);
	%><br>
	
	Calling Method using expression : <%= getNumber() %>
	
</body>
</html>