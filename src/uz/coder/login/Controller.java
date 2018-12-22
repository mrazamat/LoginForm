package uz.coder.login;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.System.out;

public class Controller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String _username = request.getParameter("txtusername");
        String _password = request.getParameter("txtpassword");

        try {
            if (_username != null) {
                if(_username.equals("coder") && _password.equals("12345")){
                    response.sendRedirect("welcome.jsp");
                } else {
                    out.println("Login failed. Try again");
                }
            }
        } catch (Exception ex) {
            out.println("Error: " + ex.getMessage());
        }
    }
}
