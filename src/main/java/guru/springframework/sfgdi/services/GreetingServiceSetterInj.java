package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSetterInj implements GreetingService {
    @Override
    public String getGreeting() {
        return "Greetings-setter-Inj";
    }
}
