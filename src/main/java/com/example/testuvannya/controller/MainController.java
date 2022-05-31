package com.example.testuvannya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getHome() {
        return "index";
    }
    @GetMapping("/login")
    public String getLogin(Model model){
        model.addAttribute("Hello");
        return "login";
    }
}

