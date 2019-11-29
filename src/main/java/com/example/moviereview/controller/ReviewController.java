package com.example.moviereview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {


    @GetMapping(value="/message")
    public String getMessage(){

        return "Hello World";
    }

    @GetMapping(value = "/message/{info}")
    public String showMessage(@PathVariable("info") String msg){

        return "Added One More Method";
    }
}
