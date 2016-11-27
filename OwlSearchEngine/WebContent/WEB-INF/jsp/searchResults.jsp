

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;    
}
</style>


	 <!--  Need AJAX -->
      	<table style="width:100%" >
      		<caption>Results</caption>
					<tr width=100%>
						<td><form:textarea path="result" rows="30" cols="30"/></td>
						<td><form:textarea path="description" rows="30" cols="30"/></td>
					</tr>
			</table>

		

