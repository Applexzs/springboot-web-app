package com.applexzs.curso.springbootweb.controllers;


import com.applexzs.curso.springbootweb.models.User;
import com.applexzs.curso.springbootweb.models.dto.ParamDto;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message){
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id){
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
        //Hacer algo con el usuario
        user.setName(user.getName().toUpperCase());
        return user;
    }
}
