package com.applexzs.curso.springbootweb.controllers;


import com.applexzs.curso.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Map<String, Object> model){
        User user = new User("Jesus", "Luquin");
        model.put("title", "Hola Mundo Spring Boot");
        model.put("user", user);
        return "details";
    }
}
