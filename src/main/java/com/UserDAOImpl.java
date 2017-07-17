package com;
/*import com.model.Users;*/
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

    private UserDAOImpl userDAOImpl;

    public UserDAOImpl() {

    }

    @PersistenceContext
    EntityManager entityManager;


    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //singleton
    public UserDAOImpl createUserDaoImpl() {
        if(userDAOImpl == null) {
            userDAOImpl = new UserDAOImpl(entityManager);
            return userDAOImpl;
        }
        else
            return userDAOImpl;
    }

    /*@Override
    public Users getByEmail(String email) {
        String hql = "from Users t where t.email = :email";
        Query query = getSession().createQuery(hql);
        query.setParameter("email", email);
        return (Users) query.uniqueResult();
    }

    @Override
    public Users getByEmailAndPassword(String email, String password) {
        String hql = "from Users t where t.email = :email and t.password = :password";
        Query query = getSession().createQuery(hql);
        query.setParameter("email", email);
        query.setParameter("password", password);
        return (Users) query.uniqueResult();
    }*/

    @Override
    public Users save(Users users) {
        return save(users);
    }
}