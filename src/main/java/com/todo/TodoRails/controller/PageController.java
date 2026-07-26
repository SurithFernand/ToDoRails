package com.todo.TodoRails.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // Handler for home (index) page
    @GetMapping("/")
    public String showIndexPage() {
        return "index";  // Returns the index.html page
    }

    // Handler for login page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // Returns the login.html page
    }

    // Handler for terms and conditions page
    @GetMapping("/terms")
    public String showTermsPage() {
        return "terms";
    }

}