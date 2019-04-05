package com.bbd.modisa.data.datamodel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import javax.ws.rs.Path;
import java.io.IOException;
import java.io.PrintWriter;

@Path("/createUser")
@Transactional
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    /*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
    private EntityManager entityManager = null;*/

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("fName");
        String surName = request.getParameter("lName");
        out.println("<html>");
        out.println("<body>");
        out.println("Thanks  Mr." + "  " + name + "  " + "<br>" );
        out.println("So your last Name is : " + "  " + surName + "<br>");
        out.println("</body></html>");
    }

    /*@EJB
    UserDao userDao;

    @Override
    protected void doGet(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //display list of users
        request.setAttribute("users", userDao.getUsers());
        request.getRequestDispatcher("/user.jsp").forward(request, response);
    }

    @Override
    protected  void doPost(
            HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {


        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction();

        User user;
        EntityTransaction et = entityManager.getTransaction();
        et.begin();

        String fName = request.getParameter("fName");
        String lName = request.getParameter("lName");

        Query query = entityManager.createNativeQuery("INSERT INTO User(fName, lName) VALUES('"+fName+"', '"+lName+"')");

        query.executeUpdate();
        et.commit();
        entityManager.close();


        PrintWriter out = response.getWriter();

        out.println(fName);
        out.println(lName);
    }*/
}
