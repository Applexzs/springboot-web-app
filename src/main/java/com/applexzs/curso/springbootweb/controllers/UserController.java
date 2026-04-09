package com.applexzs.curso.springbootweb.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Map<String, Object> model){
        model.put("title", "Hola Mundo Spring Boot");
        model.put("name", "Jesus");
        model.put("lastname", "Luquin");
        return "details";
    }
}
