import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestDriver {

	@Test
	void test() {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Triangle.xml");
		context.registerShutdownHook();
		Triangle que=(Triangle) context.getBean("Triangle");
		assertEquals(que.getA().getX(),0);
		assertEquals(que.getA().getY(),0);
	}

}
