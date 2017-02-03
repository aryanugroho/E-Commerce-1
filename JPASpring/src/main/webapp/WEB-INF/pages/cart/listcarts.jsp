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
<body style="font-family: sans-serif;" data-ng-app="myApp" data-ng-controller="cartController">
	<br>
	<h3 style="color: blue; font-family: sans-serif;">Cart List:</h3>
	
	<a href="<c:url value=""/>">Add Cart</a> --- 
	<a href="<c:url value="/home"/>">Return to Index</a>
	<br/><br/>
	
	<table >
		<tr>
			<th width="5%">Cart Id</th>
			<th width="10%">Lines Amount</th>
			<th width="10%">Shipping Amount</th>
			<th width="10%">Cart Amount</th>
			<th width="17%">Ship To</th>
			<th width="7%">Status</th>
			<th width="15%">Created Date</th>
			<th width="15%">Modified Date</th>
			<th width="11%">Delete</th>
		</tr>
		<tr data-ng-repeat="c in carts">
<!-- 		<td><a data-ng-href="/jpaproject/User/editcart?cartId={{c.id.id}}&status={{c.cartDetails.status.id}}">{{c.id.id}}</a></td> -->
<!--           <td>{{c.cartDetails.linesAmount | currency}}</td> -->
<!--           <td>{{c.cartDetails.shippingAmount | currency}}</td> -->
<!--           <td>{{c.cartDetails.cartAmount | currency}}</td> -->
<!--           <td>{{c.cartDetails.shipTo.name}}</td> -->
<!--           <td>{{c.cartDetails.status.description}}</td> -->
<!--           <td>{{c.audit.createDate | date:"medium"}}</td> -->
<!--           <td>{{c.audit.updateDate | date:"medium"}}</td> -->
<!--           <td><div data-ng-show='{{c.cartDetails.status.id}} != 1300'>Delete</div></td> -->
				<td>{{c}}</td>
        </tr>
	</table>
	<br><br>
	
</body>