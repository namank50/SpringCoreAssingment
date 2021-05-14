import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Employee;

public class Test {

	@org.junit.Test
	public void test() {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("resource-annotation.xml");

		Employee emp = ac.getBean("myemployee", Employee.class);

        assertAll(
        		()->assertEquals(emp.getCompany().getName(),"Huyandai Inc."),
        		()->assertEquals(emp.getCompany().getLocation(),"India"),
        		()->assertEquals(emp.getId(),23651));
        		
        	}
	}

}
