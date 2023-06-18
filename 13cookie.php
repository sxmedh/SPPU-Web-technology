<!DOCTYPE html>
<html>
<head>
    <title>External PHP Example</title>
</head>
<body>
    <h1>Welcome to My Website!</h1>

<?php
    setcookie('my_cookie', 'Hello, Cookie!', time() + 3600);

    if (isset($_COOKIE["Myname"]))
        echo "<h3>Welcome " . $_COOKIE["Myname"]."!!!</h3>";
    else
        echo "<h3>Welcome guest!</h3>";
?>
</body>
</html>
