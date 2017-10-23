<html>
<head>
    <title>Custom Login Page</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
</head>

<body>
<#if error><p><strong>Please check your username and password and try again!</strong></p></#if>
<#if loggedOut><p><strong>Good bye!</strong></p></#if>
<!--{contextPath}/-->
<form method="post">
    <p>
        Username: <input type="text" name="username"/>
    </p>
    <p>
        Password: <input type="password" name="password"/>
    </p>
    <p>
        <input class="button" type="submit" value="Login"/>
    </p>
</form>

<p>
    (The background of this page is yellow to demonstrate the use of a custom stylesheet.)
</p>
</body>
</html>