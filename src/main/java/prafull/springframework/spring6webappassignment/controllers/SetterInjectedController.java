package prafull.springframework.spring6webappassignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import prafull.springframework.spring6webappassignment.services.GreetingService;

@Controller
public class SetterInjectedController {
    @Autowired // Not recommended
    private GreetingService greetingService;
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
