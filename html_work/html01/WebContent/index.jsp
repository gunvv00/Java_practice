<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>파일 목록</h1>
<%
File f = new File("C:\\java_src\\html_work\\html01\\WebContent");
File[] fileList = f.listFiles();
String path = "";
String filename = "";
for(File tempFile: fileList) {
	path = tempFile.getParentFile().toString();
	filename = tempFile.getName();
	if(filename.contains(".html")) {
		System.out.println(path);
		System.out.println(filename);
		System.out.println();
		
%>
<a href="<%= filename%>" target="_blank"><%= filename%> 파일로 이동</a></br>
<%
	}
}
%>


	
</body>
</html>