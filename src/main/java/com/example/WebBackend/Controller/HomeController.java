package com.example.WebBackend.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")

    public String home(){
        return "Welcome to the Home Page";
    }
}
