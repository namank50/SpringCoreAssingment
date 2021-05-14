import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

class TestDriver {

	@Test
	void test() {
		ExpressionParser expressionParser = new SpelExpressionParser();

		Expression expression = expressionParser.parseExpression("'Hello SpEL'");
		String strVal = expression.getValue(String.class);
		
		assertEquals(strVal,"Hello SpEl");
		
		expression = expressionParser.parseExpression("'Hello SpEL'.concat('!')");
		strVal = expression.getValue(String.class);
		assertEquals(strVal,"Hello SpEl!");
		
		expression = expressionParser.parseExpression("16 * 5");
		Integer intVal = expression.getValue(Integer.class);
		assertEquals(intVal,80);
		
		expression = expressionParser.parseExpression("5 < 9");
		boolean boolVal = expression.getValue(Boolean.class);
		assertEquals(boolVal,true);
		
		expression = expressionParser.parseExpression("400 > 200 && 200 < 500");
		boolVal = expression.getValue(Boolean.class);
		assertEquals(boolVal,true);
		
		
		
	}

}
