package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        System.out.println("beforeEach - start");
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
        System.out.println("beforeEach - end");
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}