package prafull.springframework.spring6webappassignment.controllers;

import org.springframework.stereotype.Controller;
import prafull.springframework.spring6webappassignment.services.GreetingService;
import prafull.springframework.spring6webappassignment.services.GreetingServiceImpl;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I am a controller");

        return greetingService.sayGreeting();
    }
}
