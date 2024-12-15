package com.java.findworks.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Add logic to authenticate user using username and password
        // If authentication fails, add an error message to the model
        boolean loginSuccess = false; // Replace with actual authentication logic

        if (!loginSuccess) {
            model.addAttribute("error", "Invalid username or password");
            return "login"; // Return to login page with error
        }

        return "redirect:/candidate/index"; // Redirect to the candidate index page on success
    }
}