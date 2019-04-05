package com.bbd.modisa.bean;

import com.bbd.modisa.data.entities.User;
import com.bbd.modisa.ejb.UserEJB;

import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
@ManagedBean
public class UserBean {
    @Inject
    UserEJB userEJB;

    public List<User> getAll(){
        return userEJB.getAll();
    }
}

