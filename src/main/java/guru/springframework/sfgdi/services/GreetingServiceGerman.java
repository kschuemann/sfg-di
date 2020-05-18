package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("DE")
@Service("internationalGreetingService")
public class GreetingServiceGerman implements GreetingService {

    @Override
    public String getGreeting() {
        return "Hallo zusammen - DE";
    }
}