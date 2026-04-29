package com.example.demo.controller;

import com.example.demo.model.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @PostMapping("/login")
    public String submitLogin(@ModelAttribute LoginForm loginForm, Model model) {
        model.addAttribute("loginForm", loginForm);
        model.addAttribute("message", "Login captured (no implementation yet).");
        return "login";
    }
}

