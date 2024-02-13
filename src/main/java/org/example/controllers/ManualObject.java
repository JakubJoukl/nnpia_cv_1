package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.example.services.IGreetingService;
import org.example.services.MyGreetingService;

@Controller
public class ManualObject {
    private final IGreetingService greetingService;

    public ManualObject(){
        this.greetingService = new MyGreetingService();
    }

    public void greet(){
        greetingService.sayGreeting();
    }
}
