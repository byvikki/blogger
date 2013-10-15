<%@ tag language="java" description="Generic layout"
	pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<%@ attribute name="title" required="true"%>
<t:genericpage>


	<jsp:attribute name="header">		
		
		<title>${title}</title>
		<%@ include file="/WEB-INF/_layouts/_header.jsp" %>
		
	</jsp:attribute>
	<jsp:body>
		<jsp:doBody />
		
		<jsp:include page="/WEB-INF/_layouts/footer.jsp">
			<jsp:param value="footer content" name="foo"/>
		</jsp:include>
		
		
	</jsp:body>


</t:genericpage>
