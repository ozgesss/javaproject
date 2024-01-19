package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/Hello")
    public String hello(){

        return "Hello Vistula, in my first Spring Controller.";
    }


    @GetMapping(value = "/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model){
        model.addAttribute("name",name);
        return "greeting";
    }



}
