
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<html>

<style type="text/css">
thead {
	color: green;
}

tbody {
	color: blue;
}

tfoot {
	color: red;
}

table {
	border: 1px solid black;
}

body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>

<head>
<title>OWL Basic Search</title>

</head>
<body>

	<table border="0">
		<tr align="center">
			<td align="center">Basic OWL Search
				<div></div>
			</td>
		</tr>
	</table>

	<form:form method="POST" action="/searchResults"
		modelAttribute="basicSearch">

		<table frame="box" border="0">
			<!--  Show a Basic Search Box Here  -->
			<tr>You can select/input the basic search options.
			</tr>
			<tr>
				<td>Metadata :</td>
				<td><form:select path="metadata1" multiple="false"
						items="${metadata1}">
					</form:select></td>
				<td><form:input path="metadata2" /></td>
			</tr>
			<tr>
				<td>Knowledge Scope :</td>
				<td><form:select path="knowledgeScope1" multiple="false"
						items="${knowledgeScope1}">
					</form:select></td>
				<td><form:select path="knowledgeScope2" multiple="false"
						items="${knowledgeScope2}">
					</form:select></td>
				<td><form:select path="knowledgeScope3" multiple="false"
						items="${knowledgeScope3}">
					</form:select></td>
				<td><form:select path="knowledgeScope4" multiple="false"
						items="${knowledgeScope4}">
					</form:select></td>

			</tr>

			<tr>
				<td>Variable Options</td>
				<td><form:select path="variableOptions1" multiple="false"
						items="${variableOptions1}">
					</form:select></td>
				<td><form:select path="variableOptions2" multiple="false"
						items="${variableOptions2}">
					</form:select></td>
				<td><form:select path="variableOptions3" multiple="false"
						items="${variableOptions3}">
					</form:select></td>
				<td colspan="2"><input type="submit" value="Search" /></td>

			</tr>
		</table>
		<br>
		
		 <jsp:include page="searchResults.jsp"></jsp:include> 

	</form:form>


	 



</body>
</html>