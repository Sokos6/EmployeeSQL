<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Employee Info | geekCommerce</title>

<jsp:include page="_head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="_nav.jsp"></jsp:include>
       <form id="searchbox" method="GET" action="process.do">
             <input id="search" type="text" placeholder="Query Employees" name="data" /><br />
             <input id="submit" type="submit" value="Submit" /><br />
       </form>
       <form id="searchbox" method="POST" action="update.do">
             <input id="search" type="text" placeholder="Update Employees" name="data" /><br />
             <input id="submit" type="submit" value="Submit" /><br />
       </form>
</body>
</html>