package prafull.springframework.spring6webappassignment.controllers;

import prafull.springframework.spring6webappassignment.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
