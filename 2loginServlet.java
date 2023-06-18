import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class helloWorld extends HttpServlet{
    
    public void doGet(HttpServletRequest request, HttpsServletresponse response) 
    throws ServletException, IOException{
        response.setContentType("text/html");
        PrinterWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        out.println("<html>");
        out.println("<head><title> hello </title></head>");
        out.println("<body>");
        out.println("<p>name "+username+"</p>");
        out.println("<p>password "+password+"</p>");
        out.println("</body></html>");
    }
}
