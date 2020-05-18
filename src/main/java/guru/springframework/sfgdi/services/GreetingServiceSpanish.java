package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("internationalGreetingService")
public class GreetingServiceSpanish  implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hola Mundo - ES";
    }
}
