package org.example.services;

import org.springframework.stereotype.Service;

@Service
public class MyGreetingService implements IGreetingService {
    @Override
    public void sayGreeting() {
        System.out.println("Tohle je MyGreetingService!");
    }
}
