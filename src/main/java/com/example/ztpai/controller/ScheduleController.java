package com.example.ztpai.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {
    private static final String SCHEDULE_PATH = "/schedule";

    private static final String SCHEDULE_PATH_ID = SCHEDULE_PATH + "/{id}";

    @GetMapping(value = SCHEDULE_PATH)
    public String showSchedulePage() {
        return "schedule";
    }
}
