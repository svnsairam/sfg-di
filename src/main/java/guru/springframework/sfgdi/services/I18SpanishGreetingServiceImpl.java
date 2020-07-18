package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SPN")
@Service("i18Service")
public class I18SpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world from SPANISH -- greeting service impl";
    }
}

