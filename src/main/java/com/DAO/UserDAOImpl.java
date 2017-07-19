package com.DAO;
/*import com.model.Users;*/

import com.Entity.Users;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@Transactional
public class UserDAOImpl implements UserDAO {


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Users save(Users user) {
        entityManager.persist(user);
        return user;
    }
}