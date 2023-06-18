<html><head><title> PHP Demo </title></head><body>

<?php
$i=10;
echo "<h3>Welcome to first PHP Document</h3>";
echo "The value of variable is = $i";

$variable_name="value";

$marks = "10";
$marks = (int)$marks;
$roll_no = 32;

printf("hello world");
printf("the student %d marks %f",$roll_no,$marks);

$today = getdate();
switch($today['weekday'])
{case "Monday":print "Today is Monday";
break;
case "Tuesday":print "Today is Tuesday ";
break;
case "Wednesday":print "Today is Wednesday ";
break;
case "Thursday":print "Today is Thursday";
break;
case "Friday":print "Today is Friday";
break;
case "Saturday":print "Today is Saturday";
break;
case "Sunday":print "Today is Sunday ";
break;
default: print "Invalid input";
}

while($i<=10)
{
print $i;
print "<br/>";
$i++;
}

for($i=1;$i<n;$i++)
{
print $i;
print "<br/>";
}


$fruits = array("Mango", "Apple", "Banana","Grapes");
echo $fruits[0] . "," . $fruits[1] . "," . $fruits[2] . ",". $fruits[3];

$Student = array
(
array(10,"AAA"),
array(20,"BBB"),
array(30,"CCC"),
);
echo "The elements in Two dimensional array...<br/>";
for ($row = 0; $row < 3; $row++) {
for ($col = 0; $col < 2; $col++) {
echo " ".$Student[$row][$col];
}
echo "<br/>";
}

function Addition($a,$b)
{
$c=$a+$b;
return $c;
}
print "<b>The Function Demo Program with parameter passing and return
statement</b>";
print "<br/>";
$x=10;
$y=20;
print "10+20= ".Addition($x,$y);

$to = "xyz@mysite.com";
$subject = "Hi!";
$body = "Hi,\n\nHow are you?";
if (mail($to, $subject, $body))
{
echo("<p>Email successfully sent!</p>");
}
else
{
echo("<p>Failure in Email delivery!!!</p>");
}


$Str1="PHP is Fun";
$length = strlen($Str1);
echo "<b> Length:</b>The length of string: $Str1 is = $length";
echo "<br/><b>Position: </b>The position of word Fun in the $Str1 is ".strpos($Str1,'Fun');
$Str1="Hello";
$Str2="hello";
if(strcmp($Str1,$Str2))
echo "<br/><b>Comparison: </b> The two strings $Str1 and $Str2 are not equal";
else
echo "<br/><b>Comparision: </b> The two strings $Str1 and $Str2 are equal";
$Str1="HELLO";
echo "<br/><b>Changing Case: </b> The string $Str1 becomes ".strtolower($Str1);
echo "<br/><b>Reversing String: </b> The string $Str1 is reversed as ".strrev($Str1);
$Str1="Hello";
$Str2="Friend";
echo "<br/><b>Concatenating strings: </b> The string $Str1 and $Str2 are concatenated
".$Str1.$Str2;
echo "<br/><b>Replacing all instances of string: </b> The string tictactoe is now ";
echo str_replace("t","p","tictactoe");
$Str1="PHP is fun";
$newstring=substr_replace($Str1,"FUN",7,9);
echo "<br><b>Replacing substring: </b> $Str1 becomes $newstring";
?>



</body></html>