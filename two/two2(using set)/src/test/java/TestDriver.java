import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDriver {

	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Questions.xml");
		Questions que=(Questions) context.getBean("Questions");
		assertAll(
				()->assertEquals(que.getQuestion(),"Why Should we hire you?"),
				()->assertEquals(que. getQuestionId(),25)
			);
	}

}
