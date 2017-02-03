<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://getbootstrap.com/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="http://codepen.io/zavoloklom/pen/IGkDz.css">
</head>
<head>
	<title>Carts</title>
	<meta charset="UTF-8">
</head>
<body data-ng-app="webapp" data-ng-controller="userController">
<br>
	<h3 style="color: blue; font-family: sans-serif;">User List:</h3>
		
	<a href="<c:url value="/User/create?status="/>">Add User</a> --- 
	<a href="<c:url value="/User/home"/>">Return to Index</a>
	
	<br/><br/>
	<table>
	<thead>
		<tr>
			<th width="5%">Username</th>
			<th width="10%">Name</th>
			<th width="10%">Role</th>
			<th width="10%">Active</th>
			<th width="11%">Delete</th>
		</tr>
		</thead>
		<tbody>
		<tr data-ng-repeat="u in users">
		<td><a data-ng-href="/jpaproject/User/edituser?username={{u.username}}&status={{u.status}}">{{u.username}}</a></td>
          <td>{{u.name}}</td>
          <td>{{u.role.description}}</td>
          <td>{{u.status}}</td>
          <td><div data-ng-show='{{u.role.description}} === "Registered User"'>Delete</div></td>
        </tr>
        </tbody>
	</table>
	<script src="http://codepen.io/zavoloklom/pen/IGkDz.js"></script>
</body>