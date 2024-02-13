package org.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.example.services.IGreetingService;

@Controller
public class Setter {
    private IGreetingService greetingService;

    @Autowired
    public void setGreetingService(IGreetingService greetingService){
        this.greetingService = greetingService;
    }

    public void greet(){
        greetingService.sayGreeting();
    }
}
