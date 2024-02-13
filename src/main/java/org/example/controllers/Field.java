package org.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.example.services.IGreetingService;


@Controller
public class Field {
    @Autowired
    private IGreetingService greetingService;

    public void greet(){
        greetingService.sayGreeting();
    }
}
