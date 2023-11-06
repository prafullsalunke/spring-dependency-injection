package prafull.springframework.spring6webappassignment.controllers;

import org.springframework.stereotype.Controller;
import prafull.springframework.spring6webappassignment.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
