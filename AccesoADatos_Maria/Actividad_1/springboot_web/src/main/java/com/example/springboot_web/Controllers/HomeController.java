package com.example.springboot_web.Controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springboot_web.Models.User;

@Controller
public class HomeController {
    

    @GetMapping({"","/","/home"})
    public String mostrar(Map<String,Object> model){
        User user = new User("Mjose", "Martin");
        user.setEmail("javmaccas@gmil.com");

        model.put("title", "hola mundo");
        model.put("user", user);

        return "details";
    }

}
