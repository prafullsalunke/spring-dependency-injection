package prafull.springframework.spring6webappassignment.controllers;

import prafull.springframework.spring6webappassignment.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
