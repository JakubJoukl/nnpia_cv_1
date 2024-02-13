package controllers;

import org.example.Main;
import org.example.controllers.Field;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Main.class)
class FieldTest {
    @Autowired
    private Field field;
    @Test
    public void test(){
        field.greet();
    }
}