package prafull.springframework.spring6webappassignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import prafull.springframework.spring6webappassignment.services.GreetingService;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;
    @Autowired // Not recommended
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("SetterInjectedController.setGreetingService");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
