package M5;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
    private String message;

    public void init() throws ServletException{
        message = "Hello World";
    }

    public void doGet(HttpServletRequest req, HttpServletResponse ros) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter obj1 = res.getWriter();
        obj1.println("<h1>"+message+"</h1>");
    }
    public void destroy(){
        // do nothing
    }
}