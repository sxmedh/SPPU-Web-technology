import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class JDBC extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/StudentDB";
            String username = "your-username";
            String password = "your-password";
            Connection connection = DriverManager.getConnection(url, username, password);

            out.print("You are successfully Connected to Database...");
            String sql = "SELECT * FROM Students";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Display the student information
            out.println("<html>");
            out.println("<head><title>Student Database</title></head>");
            out.println("<body>");
            out.println("<h1>Student Database</h1>");
            out.println("<table border='1'>");
            out.println("<tr><th>Student ID</th><th>Name</th><th>Major</th></tr>");
            while (resultSet.next()) {
                int studentId = resultSet.getInt("StudentID");
                String name = resultSet.getString("Name");
                String major = resultSet.getString("Major");
                out.println("<tr><td>" + studentId + "</td><td>" + name + "</td><td>" + major + "</td></tr>");
            }
            out.println("</table>");
            out.println("</body></html>");
        }

        catch (SQLException e) {
            throw new ServletException("Could not display records.", e);
        }

    }
}
