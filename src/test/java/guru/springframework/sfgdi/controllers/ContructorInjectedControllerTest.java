package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceConstructorInjImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContructorInjectedControllerTest {

    ContructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ContructorInjectedController(new GreetingServiceConstructorInjImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}