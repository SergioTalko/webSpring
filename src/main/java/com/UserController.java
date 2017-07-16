
package com;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.PersistenceContext;
import java.util.List;

public class UserController implements UserDAO {

    private UserController userController;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserService userService;

    @PersistenceContext
    EntityManager entityManager;


    public UserController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //singleton
    public UserController createUserDaoImpl() {
        if(userController == null) {
            userController = new UserController(entityManager);
            return userController;
        }
        else
            return userController;
    }

    @Override
    public Users save(Users user) {
        return save(user);
    }

    @RequestMapping("/register")
    ModelAndView register() throws Exception{
        Users user = new Users("test@gmail.com", "password", "admin");

        Users savedUser = userService.saveUser(user);
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("user",savedUser);
        modelAndView.addObject("state", "registered");
        return modelAndView;

    }

}
