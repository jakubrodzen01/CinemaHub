package com.example.ztpai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
    private static final String PROFILE_PATH = "/profile";
    private static final String PROFILE_PATH_ID = PROFILE_PATH + "/{id}";
    @GetMapping(PROFILE_PATH)
    public String showProfilePage() {
        return "profile";
    }
}
