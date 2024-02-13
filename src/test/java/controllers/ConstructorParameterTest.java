package controllers;

import org.example.Main;
import org.example.controllers.ConstructorParameter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Main.class)
class ConstructorParameterTest {
    @Autowired
    private ConstructorParameter constructorParameter;
    @Test
    public void test(){
        constructorParameter.greet();
    }
}