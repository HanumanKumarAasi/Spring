package org.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//mapping the url into the server
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {


    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("servlet");

        //setting the content to return in the client side
        res.setContentType("text/html");
        //sending the data to client
        res.getWriter().println("<h2>Hello world</h2>"); //this will print in html format
    }

}
