
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Users</title>
<meta charset="UTF-8">
</head>
<body data-ng-app="webapp" data-ng-controller="userController" style="font-family: sans-serif;">
	<h3 style="color: blue; font-family: sans-serif;">Edit User</h3>
	
	<div>
  <form novalidate name="userForm" data-ng-submit="print(user); showres = true;">
  
  <div class="form-group" data-ng-class="{ 'has-error' : userForm.name.$invalid && !userForm.name.$pristine }">
            <label>Name</label>
            <input type="text" name="name" class="form-control" data-ng-model="user.name" required>
            <p data-ng-show="userForm.name.$invalid && !userForm.name.$pristine" class="help-block">You name is required.</p>
        </div>
        
        <div class="form-group" data-ng-class="{ 'has-error' : userForm.lastname.$invalid && !userForm.lastname.$pristine }">
            <label>Last Name</label>
            <input type="text" name="lastname" class="form-control" data-ng-model="user.lastname" required>
            <p data-ng-show="userForm.lastname.$invalid && !userForm.lastname.$pristine" class="help-block">You last name is required.</p>
        </div>
        
        <div class="form-group" data-ng-class="{ 'has-error' : userForm.email.$invalid && !userForm.email.$pristine }">
            <label>Email</label>
            <input type="email" name="email" class="form-control" data-ng-model="user.email">
            <p data-ng-show="userForm.email.$invalid && !userForm.email.$pristine" class="help-block">Enter a valid email.</p>
        </div>
    <input class="btn waves-effect waves-light" type="button" data-ng-click="reset();showres = false;" value="Reset" />
    <input class="btn waves-effect waves-light" type="submit" data-ng-disabled="!buttonDisable()" value="Save" />
  </form>
  <br>
  <div data-ng-show="showres">
    <div>Name = {{final.name}}</div>
    <div>Last Name = {{final.lastname}}</div>
    <div>E-mail = {{final.email}}</div>
    Is Valid: {{isValid}}
  </div>
</div>

	 <form:form method="post" action="academy/User/home" modelAttribute="user" >
		<table style="width: 80%;">
		
			<tr>
				<td width="8%">Username</td>
				<td width="10%"><input type="text" name="username"
					value="${users.username}" readonly="readonly"></td>
			</tr>
			<tr>
				<td width="8%">Password:*</td>
				<td width="10%"><input type="text" name="password" value=""
					></td>
			</tr>
			<tr>
				<td>Name:*</td>
				<td><input type="text" name="name" value="${users.name}">
				</td>
			</tr>
			<tr>
				<td>Active:*</td>
				<td><select name="Status">
						<option value="0">- Select -</option>
						<c:forEach var="listStatus" items="${listStatus}">
							<option value="${listStatus}"
								<c:if test="${listStatus eq users.status}">selected</c:if>>${listStatus}</option>
						</c:forEach>
				</select></td>
			</tr>

			<tr>
				<td width="10%">User role:*</td>
				<td width="25%"><select name="userRole">
						<option value="0">- Select -</option>
						<c:forEach var="userRole" items="${userRole}">
							<option value="${user_roleid}"
								<c:if test="${userRole.description eq users.role.description}">selected</c:if>>${userRole.description}</option>
						</c:forEach>
				</select></td>
			</tr>


		</table>

		<br> <input type="submit" name="update" value="Update">
	  </form:form>

	<br>

	<br>
	<a href="<c:url value="/User/List?subroot=User"/>">Return to List</a>
</body>
</html>