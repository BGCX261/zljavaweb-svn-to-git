<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'selectcourse.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<script type="text/javascript" src="/WebRoot/JS/prototype.js"></script>
	<script type="text/javascript" src="../JS/jquery-1.7.1.min.js"></script>
	<script type="text/javascript">
		$(function()
		{
			$("#right").click(
			function()
			{
				var $options = $("#select option:selected");
				var $remove  = $options.remove();
				$remove.appendTo("#select2");
			}
			)
			$("#left").click(
			function()
			{
				var $options = $("#select2 option:selected");
				var $remove = $options.remove();
				$remove.appendTo("#select");
			}
			)
			$("#rightAll").click(
			function()
			{
				var $options = $("#select option");
				var $remove = $options.remove()
				$remove.appendTo("#select2");
			}
			)
			$("#leftAll").click(
			function()
			{
				var $options = $("#select2 option");
				var $remove = $options.remove();
				$remove.appendTo("#select");
			}
			)
		})
	</script>
  </head>
  
  <body>
   		<div id="select">
   			<table>
   				<tr>
   					<td align="right">学号：</td>
					<td align="left"><input type="text" name="studentNO"/></td>
				</tr>
				<tr>
   					<td align="right">姓名：</td>
					<td align="left"><input type="text" name="name"/></td>
				</tr>
				<tr>
   					<td align="right">专业：</td>
					<td align="left"><input type="text" name="major"/></td>
				</tr>
				<tr>
   					<td width="120">
   						<div>
   							<label>
   								<select multiple="multiple" size="6" id="select">
   									<option value="英语听说">英语听说</option>
									<option value="书法艺术">书法艺术</option>
									<option value="视听说">视听说</option>
									<option value="四级培训">四级培训</option>
									<option value="六级培训">六级培训</option>
									<option value="数据库原理">数据库原理</option>
   								</select>
   							</label>
   						</div>
					</td>
					<td width="50">
						<div align="center">
							<input type="button" name="right" id="right" value="&gt;|"/><br>
							<input type="button" name="rightAll" id="rightAll" value="&gt;&gt;"/><br>
							<input type="button" name="left" id="left" value="&lt;|"/><br>
							<input type="button" name="leftAll" id="leftAll" value="&lt;&lt;"/><br>
						</div>
					</td>
					<td>
						<div>
							<select id="select2" name="select2" multiple="multiple" size="6"></select>
						</div>
					</td>
				</tr>
   			</table>
			
   		</div>
  </body>
</html>
