package controllers;

import org.springframework.stereotype.Component;
import services.IGreetingService;
import services.MyGreetingService;

public class ManualObject {
    private final IGreetingService greetingService;

    public ManualObject(){
        this.greetingService = new MyGreetingService();
    }

    public void greet(){
        greetingService.sayGreeting();
    }
}
