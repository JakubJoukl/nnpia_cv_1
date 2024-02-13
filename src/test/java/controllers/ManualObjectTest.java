package controllers;

import org.junit.jupiter.api.Test;
import services.IGreetingService;
import services.MyGreetingService;

import static org.junit.jupiter.api.Assertions.*;

class ManualObjectTest {
    @Test
    public void test(){
        ManualObject manualObject = new ManualObject();
        manualObject.greet();
    }
}