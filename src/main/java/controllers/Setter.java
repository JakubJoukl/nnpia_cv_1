package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.IGreetingService;


public class Setter {
    private IGreetingService greetingService;


    public void setGreetingService(IGreetingService greetingService){
        this.greetingService = greetingService;
    }

    public void greet(){
        greetingService.sayGreeting();
    }
}
