package com.applexzs.curso.springbootweb.controllers;


import com.applexzs.curso.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Map<String, Object> model){
        User user = new User("Jesus", "Luquin");
        user.setEmail("jesus@mail.com");
        model.put("title", "Hola Mundo Spring Boot");
        model.put("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){

//        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios!");

        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
        User user = new User("Pepa", "Gonzales", "pepa@mail.com");
        User user2 = new User("Lalo", "Perez", "lalo@mail.com");
        User user3 = new User("Anita", "Roe");
        List<User> users = Arrays.asList(user, user2, user3);
        return users;

    }
}
