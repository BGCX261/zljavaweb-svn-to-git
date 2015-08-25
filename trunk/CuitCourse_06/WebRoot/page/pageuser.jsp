<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'pageuser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="./JS/jquery-1.7.1.min.js"></script> 
	<link rel="stylesheet" type="text/css" href="./Style/layout.css">
	
  </head>
  
  <body>
    <div>
    	<table style="border:1;"> 
    		<s:iterator value="showlayer" >
    			<tr id="linecolor">
    				<td style="border:1px ;">
    					<s:property value="userid"/>
    				</td>
    				<td>
    					<s:property value="username"/>
    				</td>
    				<td>
    					<s:property value="password"/>
    				</td>
    			</tr>
    		</s:iterator>
    	</table>
    </div>
	
  </body>
</html>
