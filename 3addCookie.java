
// <form name="form1" method="post" action="http ://localhost:8080/examples/servlet/mycookieservlet">
// <h3> Enter the value for my Cookie: </h3>
// <input type=text name="txt_data" size =30 value=" ">
// <input type=submit value="Submit">
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class addCookie extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String txt_data = request.getParameter("txt_data");
        // Create cookie.
        Cookie cookie = new Cookie("My_Cookie", txt_data);
        // Adding cookie to HTTP response.
        response.addCookie(cookie);
        // Write friendly output to browser.
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>MyCookie has been set to : ");
        out.println(txt_data);
        out.println("<br><br><br>");
        out.println("This page shows that the cookie has been added");
        out.close();
    }
}
