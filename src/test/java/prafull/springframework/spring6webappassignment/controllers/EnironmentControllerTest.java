package prafull.springframework.spring6webappassignment.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"QA","EN"})
@SpringBootTest
class EnironmentControllerTest {

    @Autowired
    EnironmentController controller;

    @Test
    void getDataSource() {
        System.out.println(controller.getEnvironment());
    }
}