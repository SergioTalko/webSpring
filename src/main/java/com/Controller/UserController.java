
package com.Controller;


import com.DAO.UserDAOImpl;
import com.Entity.Users;
import com.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Controller

public class UserController {

    @Autowired
    private UserServiceImpl userService;


    @RequestMapping("/register")
    ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView("welcome");

        Users user = new Users("test@gmail.com", "test", "password", "admin");

        modelAndView.addObject("user", user);
        modelAndView.addObject("state", "registered");

        userService.saveUser(user);

        return modelAndView;

    }

}
