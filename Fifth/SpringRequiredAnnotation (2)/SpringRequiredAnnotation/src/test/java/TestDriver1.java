import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity.Emp;

class TestDriver1 {

	@Test
	void test() {
		ApplicationContext nk = new ClassPathXmlApplicationContext("required-annotation.xml");

		Emp emp = nk.getBean("myemployee", Emp.class);
		
		assertAll(
		()->assertEquals(emp.getName(),"Naman"),
		()->assertEquals(emp.getCompany(),"Google Inc."),
		()->assertEquals(emp.getDesignation(),"Human Resource"));
	}

}
