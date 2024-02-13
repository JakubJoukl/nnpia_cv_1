package org.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.example.services.IGreetingService;

@Controller
public class ConstructorParameter {
    private IGreetingService greetingService;

    public ConstructorParameter(IGreetingService greetingService){
        this.greetingService = greetingService;
    }

    public void greet(){
        greetingService.sayGreeting();
    }
}
