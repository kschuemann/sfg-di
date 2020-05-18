package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceConstructorInjImpl implements GreetingService {
    @Override
    public String getGreeting(){
        return "Greetings *Y-Hand*-constructorInj";
    }
}
