package prafull.springframework.spring6webappassignment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import prafull.springframework.spring6webappassignment.controllers.MyController;

@SpringBootTest
class Spring6WebappAssignmentApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;
	@Test
	void testAutowireOfConroller() {
		System.out.println(myController.sayHello());
	}
	@Test
	void testGetControllerFromCtx(){
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}
	@Test
	void contextLoads() {
	}

}
