package com.example.valerienails.controllers.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        List<String> certificates = new ArrayList<>();
        certificates.add("/images/team-member-8-122x170_original.jpg");
        certificates.add("/images/team-member-7-119x170_original.jpg");
        certificates.add("/images/team-member-9-119x170.jpg");
        certificates.add("/images/team-member-10-121x170_original.jpg");
        model.addAttribute("certificates", certificates);
        return "about";
    }

    public String contact() {
        return "contact";
    }

    @GetMapping("/booking")
    public String booking() {
        return "booking";
    }

    @GetMapping("/services")
    public String services() {
        return "services";
    }

}
