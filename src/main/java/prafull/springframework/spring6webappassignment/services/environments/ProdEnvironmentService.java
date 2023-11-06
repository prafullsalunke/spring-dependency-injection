package prafull.springframework.spring6webappassignment.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prafull.springframework.spring6webappassignment.services.EnvironmentService;

@Profile("PROD")
@Service("envService")
public class ProdEnvironmentService implements EnvironmentService {
    @Override
    public String getDataSource() {
        return "Environment : Production";
    }
}
