import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity.Emp;

import property.BasicApplicationScope;
import property.SomeExternalService;

class TestDriver {

	@Test
	void test() {
		ApplicationContext nk = new ClassPathXmlApplicationContext("required-annotation.xml");

		AnnotationConfigApplicationContext run = new AnnotationConfigApplicationContext(BasicApplicationScope.class);
		SomeExternalService personDAO = run.getBean(SomeExternalService.class);
		
		assertAll(
		()->assertEquals(personDAO.getUrl(),"localhost:8080"),
		()->assertEquals(personDAO.getPassword(),"Naman"),
		()->assertEquals(personDAO.getUsername(),"Password"));
	}
	}

}
