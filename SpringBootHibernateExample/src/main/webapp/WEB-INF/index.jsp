
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<style>           
.blue-button{
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',endColorstr='#188BC0',GradientType=0);
	padding:3px 5px;
	color:#fff;
	font-family:'Helvetica Neue',sans-serif;
	font-size:12px;
	border-radius:2px;
	-moz-border-radius:2px;
	-webkit-border-radius:4px;
	border:1px solid #1A87B9
}     
table {
  font-family: "Helvetica Neue", Helvetica, sans-serif;
   width: 90%;
}
th {
  background: SteelBlue;
  color: white;
}
 td,th{
                border: 1px solid gray;
                width: 25%;
                text-align: left;
                padding: 5px 10px;
            }
</style>
</head>
<body>

</br>
<h3>CompanyList</h3>
<c:if test="${!empty listOfCompany}">
	<table class="tg">
	<tr>
		<th width="80">Id</th>
		<th width="120">Company Name</th>
		<th width="120">Email</th>
		<th width="50">CTC</th>
		<th width="120">JD</th>
		<th width="120">profile</th>
		
	</tr>
	<c:forEach items="${listOfCompany}" var="company">
		<tr>
			<td>${company.id}</td>
			<td>${company.companyName}</td>
			<td>${company.email}</td>
			<td>${company.CTC}</td>
			<td>${company.JD}</td>
			<td>${company.profile}</td>
			
				</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
