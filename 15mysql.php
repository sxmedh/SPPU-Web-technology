<?php
// Database configuration
$servername = "localhost";
$username = "your_username";
$password = "your_password";
$database = "your_database";

// Create a connection
$conn = mysql_connect($servername, $username, $password, $database);

mysql_query("CREATE DATABASE db",$conn);

$query = "CREATE TABLE my_table(id INT(4),name VARCHAR(20))";

mysql_query($query,$conn);
mysql_close($conn);
mysql_select_db(“mydb”,$conn); //select the database
$query= "INSERT INTO my_table (id,name) VALUES(1,'SHILPA')";


?>
