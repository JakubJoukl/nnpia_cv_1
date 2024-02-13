package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.IGreetingService;
import services.MyGreetingService;


public class Field {
    private final IGreetingService greetingService = new MyGreetingService();

    public void greet(){
        greetingService.sayGreeting();
    }
}
