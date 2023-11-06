package prafull.springframework.spring6webappassignment.services.environments;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import prafull.springframework.spring6webappassignment.controllers.EnironmentController;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DevEnvironmentServiceTest {

    @Autowired
    EnironmentController controller;
    @Test
    void getDataSource() {
        System.out.println(controller.getEnvironment());
    }
}