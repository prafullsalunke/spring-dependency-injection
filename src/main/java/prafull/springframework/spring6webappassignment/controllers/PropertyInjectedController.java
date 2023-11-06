package prafull.springframework.spring6webappassignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import prafull.springframework.spring6webappassignment.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired //Not recommended
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
