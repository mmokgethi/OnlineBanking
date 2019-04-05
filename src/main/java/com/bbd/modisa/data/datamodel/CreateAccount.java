package com.bbd.modisa.data.datamodel;

import com.bbd.modisa.data.entities.User;

import javax.persistence.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@WebServlet(name = "CreateAccount", urlPatterns = {"/CreateAccount"})
@Transactional
public class CreateAccount extends HttpServlet {
    private static final long serialVersionUID = 1L;
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
    private EntityManager entityManager = null;


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction();

        EntityTransaction et = entityManager.getTransaction();
        et.begin();

        int userId = Integer.parseInt(request.getParameter("userId"));
        String accountType = request.getParameter("lName");

        Query query =  entityManager.createNativeQuery("INSERT INTO Account(availBalance, User_userId, accType)" +
                " VALUES("+0.0+" , "+userId+" , '"+accountType+"')");

        query.executeUpdate();
        et.commit();
        entityManager.close();
    }
}
