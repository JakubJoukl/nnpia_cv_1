package controllers;

import org.example.Main;
import org.example.controllers.ManualObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Main.class)
class ManualObjectTest {
    @Autowired
    private ManualObject manualObject;
    @Test
    public void test(){
        manualObject.greet();
    }
}