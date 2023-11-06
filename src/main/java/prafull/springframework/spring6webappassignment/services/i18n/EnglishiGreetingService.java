package prafull.springframework.spring6webappassignment.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prafull.springframework.spring6webappassignment.services.GreetingService;

@Profile({"EN","default"})
@Service("i18nService")
public class EnglishiGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello! how are you?";
    }
}
