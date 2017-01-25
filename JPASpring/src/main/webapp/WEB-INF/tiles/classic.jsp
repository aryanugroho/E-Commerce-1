<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tiles:importAttribute name="javascripts"/>
<tiles:importAttribute name="stylesheets"/>

<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet" href="http://getbootstrap.com/dist/css/bootstrap.min.css">
<c:forEach var="css" items="${stylesheets}">
        <link rel="stylesheet" type="text/css" href="<c:url value="${css}"/>">
    </c:forEach>
</head>
 
<body>
    <table width="100%">
        <tr>
            <td colspan="2">
                <tiles:insertAttribute name="header" />
            </td>
        </tr>
        <tr>
            <%-- <td width="20%" nowrap="nowrap">
                 <tiles:insertAttribute name="menu" />
             </td> --%>
            <td width="100%">
                 <tiles:insertAttribute name="body" />
             </td>
        </tr>
        <tr>
            <td>
                 <tiles:insertAttribute name="footer" />
            </td>
        </tr>
    </table>
    <c:forEach var="script" items="${javascripts}">
        <script src="<c:url value="${script}"/>"></script>
    </c:forEach>
</body>
</html>