package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceConstructorInjImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceConstructorInjImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}