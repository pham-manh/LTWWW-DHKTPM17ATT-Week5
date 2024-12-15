package com.java.findworks.frontend.controllers;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final AuthenticationManager authenticationManager;

    public LoginController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam String username, @RequestParam String password, Model model) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );

            if (authentication.isAuthenticated()) {
                return "redirect:/candidate/index"; // Redirect to the candidate index page on success
            }
        } catch (AuthenticationException e) {
            model.addAttribute("error", "Invalid username or password");
        }

        return "login"; // Return to login page with error
    }
}
