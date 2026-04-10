package com.applexzs.curso.springbootweb.controllers;


import com.applexzs.curso.springbootweb.models.User;
import com.applexzs.curso.springbootweb.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public UserDto details(){
        User user = new User("Jesus", "Luquin");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Jesus", "Luquin");
        User user2 = new User("John", "Doe");
        User user3 = new User("Pepe", "Doe");
        List<User> users = Arrays.asList(user, user2, user3);
//        List<User> users = new ArrayList<>();
//        users.add(user);
//        users.add(user2);
//        users.add(user3);

        return users;
    }

    @GetMapping(path = "/detailsMap")
    public Map<String, Object> detailsMap(){
        User user = new User("Jesus", "Luquin");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);

        return body;
    }
}
