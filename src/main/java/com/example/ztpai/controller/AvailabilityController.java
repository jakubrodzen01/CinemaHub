package com.example.ztpai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AvailabilityController {
    private static final String AVAILABILITY_PATH = "/availability";
    private static final String AVAILABILITY_PATH_ID = AVAILABILITY_PATH + "/{availabilityId}";

    @GetMapping(AVAILABILITY_PATH)
    public String showAvailabilityPage() {
        return "availability";
    }
}
