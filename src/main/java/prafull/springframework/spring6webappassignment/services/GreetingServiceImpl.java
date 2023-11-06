package prafull.springframework.spring6webappassignment.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello everyone from base service";
    }
}
