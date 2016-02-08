<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<jsp:include page="_head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="_nav.jsp"></jsp:include>
	<table id="queryResults" class="pure-table pure-table-bordered">
	<tbody>
	<c:forEach var="empdata" items="${result}">
		<tr>
		
		<c:forEach var="empdata2" items="${empdata}">
		
		<td>${empdata2}</td>
		
		</c:forEach>
		
		</tr>
	</c:forEach>
	</tbody>
	</table>
</body>
</html>