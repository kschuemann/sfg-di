package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceConstructorInjImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        System.out.println("beforeEach - start");
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceConstructorInjImpl();
        System.out.println("beforeEach - end");
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}