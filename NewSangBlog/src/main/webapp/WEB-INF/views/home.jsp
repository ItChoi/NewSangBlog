<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<a href="javascript:test();" >button1</a>

<button class="tag">button2</button>

<P>  The time on the server is ${serverTime}. </P>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>

	$('.tag').on('click', function() {
		alert("123123123"); 
	});
	
	function test() {
		
	}
</script>
</body>
</html>
