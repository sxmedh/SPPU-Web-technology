import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class urlRewriting extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Sring sessionId = "ID123";

        // Use URL rewriting to include the session ID in the URL
        String urlWithSessionId = response.encodeURL(request.getContextPath() + "/myPage");

        // Set the content type and get the PrintWriter
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Generate the HTML response
        out.println("<html>");
        out.println("<head><title>Session Management Example</title></head>");
        out.println("<body>");
        out.println("<h1>Session Management Example</h1>");
        out.println("<p>Session ID: " + sessionId + "</p>");
        out.println("<p><a href=\"" + urlWithSessionId + "\">Go to My Page</a></p>");
        out.println("</body>");
        out.println("</html>");
    }
}
