package controllers;

import org.junit.jupiter.api.Test;
import services.IGreetingService;
import services.MyGreetingService;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorParameterTest {
    @Test
    public void test(){
        IGreetingService greetingService = new MyGreetingService();
        ConstructorParameter constructorParameter = new ConstructorParameter(greetingService);
        constructorParameter.greet();
    }
}