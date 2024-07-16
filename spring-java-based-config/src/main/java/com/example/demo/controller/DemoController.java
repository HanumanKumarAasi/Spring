package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {


    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello Hanuman...";
    }

    private List<String> buildStrings(){
        return Arrays.asList("Hanuma","kumar","Aasi");
    }
}
