package controllers;

import org.springframework.stereotype.Component;
import services.IGreetingService;


public class ConstructorParameter {
    private final IGreetingService greetingService;

    public ConstructorParameter(IGreetingService greetingService){
        this.greetingService = greetingService;
    }

    public void greet(){
        greetingService.sayGreeting();
    }
}
