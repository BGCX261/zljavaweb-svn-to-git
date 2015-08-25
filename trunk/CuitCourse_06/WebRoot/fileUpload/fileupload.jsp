<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'fileupload.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <table style="position:relative ;top:40px ;left:290px ">
     	<tr>
     		<td height="32">上传文件：</td>
     		<td height="32"><input type="file" name=myfile/>(上传文件不要超过1M)</td>
     	</tr>
     	<tr>
     		<td height="32">重命名：</td>
     		<td height="32"><input type="text" name="filename"/></td>
     	</tr>
     	<tr>
     		<td height="32" colspan="2" align="center">
	     		<input type="submit" value="上传" />&nbsp;&nbsp;
	     		<input type="reset" value="重置" />
     		</td>
     	</tr>
     </table>
  </body>
</html>
