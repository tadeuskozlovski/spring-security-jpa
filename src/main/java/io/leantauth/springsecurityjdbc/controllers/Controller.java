package io.leantauth.springsecurityjdbc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String home(){
        return "<h1>Welcome</h1>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h1>Welcome USER or ADMIN</h1>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h1>Welcome ADMIN</h1>";
    }
}
