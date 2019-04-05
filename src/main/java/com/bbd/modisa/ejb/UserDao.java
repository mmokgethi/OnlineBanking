package com.bbd.modisa.ejb;

import com.bbd.modisa.data.entities.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class UserDao {
    @PersistenceContext private EntityManager entityManager;

    //Create user
    public void createUser(User user){
        Query query = entityManager.createQuery("INSERT INTO User(fName, lName) VALUES(user )");
        //entityManager.persist(user);
    }

    //Get User by Id
    public User getUser(int id){
        return entityManager.find(User.class, id);
    }


    //save new user
    public void persist(User user){
        entityManager.persist(user);
    }

    //Get all users
    public List<User> getUsers(){
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class);
        return query.getResultList();
    }
}
