package com.bbd.modisa.client;

import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//@WebServlet(urlPatterns = "/createUser")
public class CreateUser {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String createUsers(){
        return "User created";
    }

/*    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("fName");
        String surName = request.getParameter("lName");
        out.println("<html>");
        out.println("<body>");
        out.println("Thanks  Mr." + "  " + name + "  " + "<br>" );
        out.println("So your last Name is : " + "  " + surName + "<br>");
        out.println("</body></html>");
    }*/
}
