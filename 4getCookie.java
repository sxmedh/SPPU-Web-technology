import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class getCookieServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie[] my_cookies = request.getCookies();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<b>");
        int n = my_cookies.length;
        for (int i = 0; i < n; i++) {
            String name = my_cookies[i].getName();
            String value = my_cookies[i].getValue();
            out.println("name= " + name);
            out.println("and value= " + value);
        }
        out.close();
    }
}