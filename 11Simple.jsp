<!DOCTYPE html>
<html>
  <head>
    <title>Simple JSP Example</title>
  </head>
  <body>
    <h1>Welcome to My Website!</h1>
    <% String name = "John Doe"; int age = 25; %>
    <p>Name: <%= name %></p>
    <p>Age: <%= age %></p>
    <% if (age >= 18) { %>
    <p>You are an adult.</p>
    <% } else { %>
    <p>You are a minor.</p>
    <% } %>
  </body>
</html>
