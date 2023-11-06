package prafull.springframework.spring6webappassignment.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prafull.springframework.spring6webappassignment.services.GreetingService;

@Profile("MR")
@Service("i18nService")
public class MarathiGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Namaskar! kaay mhantay rao?";
    }
}
