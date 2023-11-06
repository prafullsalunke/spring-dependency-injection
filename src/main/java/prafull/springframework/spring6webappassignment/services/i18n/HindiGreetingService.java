package prafull.springframework.spring6webappassignment.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prafull.springframework.spring6webappassignment.services.GreetingService;

@Profile("HI")
@Service("i18nService")
public class HindiGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Namaste! aap kaise ho?";
    }
}
