package com.example.ztpai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    private static final String DASHBOARD_PATH = "/dashboard";

    @GetMapping(DASHBOARD_PATH)
    public String showDashboardPage() {
        return "dashboard";
    }
}
