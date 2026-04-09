package com.applexzs.curso.springbootweb.controllers;


import com.applexzs.curso.springbootweb.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public Map<String, Object> details(){
        User user = new User("Jesus", "Luquin");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);

        return body;
    }
}
