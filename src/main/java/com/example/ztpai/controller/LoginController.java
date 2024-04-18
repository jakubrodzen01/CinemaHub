package com.example.ztpai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    private static final String LOGIN_PATH = "/login";

    @GetMapping(LOGIN_PATH)
    public String showLoginPage() {
        return "login";
    }
}
