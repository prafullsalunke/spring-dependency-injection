package prafull.springframework.spring6webappassignment.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import prafull.springframework.spring6webappassignment.services.EnvironmentService;

@Controller
public class EnironmentController {
    private final EnvironmentService environmentService;

    public EnironmentController(@Qualifier("envService") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment(){
        System.out.println("I am the EnvironmentController");
        return environmentService.getDataSource();
    }

}
