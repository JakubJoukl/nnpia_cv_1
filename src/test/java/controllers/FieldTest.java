package controllers;

import org.junit.jupiter.api.Test;
import services.IGreetingService;
import services.MyGreetingService;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {
    @Test
    public void test(){
        Field field = new Field();
        field.greet();
    }
}