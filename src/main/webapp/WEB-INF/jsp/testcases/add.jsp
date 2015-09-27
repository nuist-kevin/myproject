<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ include file="../common/header.jsp" %>
  <div class="container">
<div class="col-xs-2">
	<ul class="nav nav-pills nav-stacked">
   <li class="active"><a href="#">Home</a></li>
   <li><a href="#">SVN</a></li>
   <li><a href="#">iOS</a></li>
   <li><a href="#">VB.Net</a></li>
   <li><a href="#">Java</a></li>
   <li><a href="#">PHP</a></li>
</ul>
</div>
<div class="col-xs-10">

<table class="table table-hover">
   <caption>
   		<span>title</span>
   		<button type="button" class="btn btn-sm btn-primary btn-add">add step</button></caption>
	<thead>
		<tr>
			<td>名称</td>
			<td>城市</td>
			<td>密码</td>
		</tr>
	</thead>
   <tbody>
      <tr>
         <td>Tanmay</td>
         <td>Bangalore</td>
         <td>560001</td>
      </tr>
      <tr>
         <td>Sachin</td>
         <td>Mumbai</td>
         <td>400003</td>
      </tr>
      <tr>
         <td>Uma</td>
         <td>Pune</td>
         <td>411027</td>
      </tr>
   </tbody>
   
</table>
</div>
</div>

<%@ include file="../common/footer.jsp" %>