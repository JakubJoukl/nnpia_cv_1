package controllers;

import org.junit.jupiter.api.Test;
import services.IGreetingService;
import services.MyGreetingService;

import static org.junit.jupiter.api.Assertions.*;

class SetterTest {
    @Test
    public void test(){
        IGreetingService greetingService = new MyGreetingService();
        Setter setter = new Setter();
        setter.setGreetingService(greetingService);
        setter.greet();
    }
}