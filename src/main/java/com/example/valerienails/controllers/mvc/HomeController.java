package com.example.valerienails.controllers.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    public String about() {
        return "about";
    }

    public String contact() {
        return "contact";
    }

    public String services() {
        return "services";
    }

}
