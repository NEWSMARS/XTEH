<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户信息</title>
    <style type="text/css">
       table{
          border: 1px solid red;
          border-collapse: collapse;/*设置单线-线合并*/
          width: 80%;
       }
       td{
          border: 1px solid red;
          padding:3px;
       }
       .header{
         background: gray;
       }
    </style>
  </head>

  <body>
    <h2>以下是所有用户信息</h2>   
    <table>
       <tr class="header" >
          <td>姓名</td>  <td>ID</td>  <td>自我描述</td> <td>教师</td>
       </tr>

        <c:forEach items="${Studentlist}" var="newPro"> 

														<tr>
                                                
                                                        <td>${newPro.name}</td>
                                               			<td>${newPro.studentId}</td>
                                                        <td>${newPro.selfDescn}</td>
                                       					<td>${newPro.teacher}</td>
                                                    </tr>

				 	</c:forEach>     

  </body>
</html>