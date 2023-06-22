import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class helloWorld extends HttpServlet{
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException{
        response.setContentType("text/html");
        PrinterWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title> hello </title></head>");
        out.println("<body>");
        out.println("<h1>hello world</h1>");
        out.println("</body></html>");
    }
}
