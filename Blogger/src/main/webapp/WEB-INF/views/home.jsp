<%@ include file="/WEB-INF/_layouts/_includes.jsp" %>

<t:layout title="My Home Page">
	
		<h1>Hello There message from Controller : ${serverTime}</h1>
		
		<form:form method="post" modelAttribute="greeting">
		
		<form:input path="name"/>
		
		<form:input path="message"/>
		
		<input type="submit" value="add greeting" />
		
		</form:form>
		
		<p> The value ${pageContext.request.contextPath} from the properties file ${properties['layouts.path']} </p>
	
</t:layout>
