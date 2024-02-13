package controllers;

import org.example.Main;
import org.example.controllers.Setter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Main.class)
class SetterTest {
    @Autowired
    private Setter setter;
    @Test
    public void test(){
        setter.greet();
    }
}