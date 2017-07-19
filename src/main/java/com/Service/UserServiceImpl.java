package com.Service;

import com.DAO.UserDAO;
import com.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public Users saveUser(Users user) {
        return userDAO.save(user);
    }
}
