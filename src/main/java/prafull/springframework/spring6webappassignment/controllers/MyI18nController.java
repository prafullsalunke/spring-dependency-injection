package prafull.springframework.spring6webappassignment.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import prafull.springframework.spring6webappassignment.services.GreetingService;

@Controller
public class MyI18nController {
    private final GreetingService greetingService;

    public MyI18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
