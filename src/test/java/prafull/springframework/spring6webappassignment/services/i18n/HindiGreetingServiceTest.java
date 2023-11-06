package prafull.springframework.spring6webappassignment.services.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import prafull.springframework.spring6webappassignment.controllers.MyI18nController;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("HI")
@SpringBootTest
class HindiGreetingServiceTest {


    @Autowired
    MyI18nController myI18nController;

    @Test
    void sayGreeting() {
        System.out.println(myI18nController.sayHello());
    }
}