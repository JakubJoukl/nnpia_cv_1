package services;

public class MyGreetingService implements IGreetingService {
    @Override
    public void sayGreeting() {
        System.out.println("Tohle je MyGreetingService!");
    }
}
