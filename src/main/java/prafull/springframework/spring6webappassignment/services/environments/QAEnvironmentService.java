package prafull.springframework.spring6webappassignment.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prafull.springframework.spring6webappassignment.services.EnvironmentService;

@Profile("QA")
@Service("envService")
public class QAEnvironmentService implements EnvironmentService {
    @Override
    public String getDataSource() {
        return "Environment : QA";
    }
}
