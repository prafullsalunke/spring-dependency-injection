package prafull.springframework.spring6webappassignment.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prafull.springframework.spring6webappassignment.services.EnvironmentService;

@Profile({"DEV","default"})
@Service("envService")
public class DevEnvironmentService implements EnvironmentService {
    @Override
    public String getDataSource() {
        return "Environment : DEV";
    }
}
