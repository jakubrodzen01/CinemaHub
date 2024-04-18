package com.example.ztpai.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdvertsController {
    private static final String ADVERT_PATH = "/adverts";
    private static final String ADVERT_PATH_ID = ADVERT_PATH + "/{advertID}";

    @GetMapping(ADVERT_PATH)
    public String showAdvertPage() {
        return "adverts";
    }
}
