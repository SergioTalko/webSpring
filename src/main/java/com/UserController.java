
package com;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.PersistenceContext;
import java.util.List;

@Controller
public class UserController extends UserDAOImpl {


    @Autowired
    private UserDAOImpl userDAO;


    @RequestMapping("/register")
    ModelAndView register() throws Exception {
        Users user = new Users("test@gmail.com", "password", "admin");

        Users savedUser = userDAO.save(user);
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("user", savedUser);
        modelAndView.addObject("state", "registered");
        return modelAndView;

    }

}
