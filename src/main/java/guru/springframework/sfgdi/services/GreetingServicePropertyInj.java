package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyInj  implements GreetingService {

    @Override
    public String getGreeting() {
        return "Hello folks - property-inj";
    }
}
