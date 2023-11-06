package prafull.springframework.spring6webappassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import prafull.springframework.spring6webappassignment.controllers.MyController;

@SpringBootApplication
public class Spring6WebappAssignmentApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring6WebappAssignmentApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In main method");
		System.out.println(controller.sayHello());

	}

}
