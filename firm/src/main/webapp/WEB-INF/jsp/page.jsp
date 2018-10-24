<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>列表</title>
    <!-- <link rel="stylesheet" href="<%=request.getContextPath() %>" type="text/css"></link> -->
	
  <body>
	<table>
		<tr>
			<td><input type="checkbox" name="fid">全选</td>
			<td>编号</td>
			<td>企业名称</td>
			<td>行业</td>
			<td>国家</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list }" var="f">
			<tr>
				<td><input type="checkbox" name="fid"></td>
				<td>${f.fid }</td>
				<td>${f.fname }</td>
				<td>${f.ftrade }</td>
				<td>
					<c:forEach items="${f.territorys }" var="t" varStatus="start">
						${t.territory.tname }
						<c:if test="${!stat.last }">,</c:if>
					</c:forEach>
				</td>
				<td>
					<a href="#">查看</a>
				</td>
			</tr>
		</c:forEach>
	</table>
  </body>
</html>
