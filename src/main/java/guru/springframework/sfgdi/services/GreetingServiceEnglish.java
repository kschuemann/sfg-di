package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("internationalGreetingService")
public class GreetingServiceEnglish implements GreetingService {

    @Override
    public String getGreeting() {
        return "Hey there - EN";
    }
}
