import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.BankSystem.BankAccount;
import com.BankSystem.BankAccountController;

public class TestDriver1 {

	@Test
	public void test() {
		 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Config.xml");  
	        BankAccountController b = (BankAccountController)applicationContext.getBean("bankaccountcontroller");
	       
	       
	       
	        assertAll(
	        		()->assertEquals( b.withdraw(BankAccount.getAccountId(),BankAccount.getAccountBalance()),140000),
	        		()->assertEquals( b.deposit(BankAccount.getAccountId(),BankAccount.getAccountBalance()),65000),
	        		()->assertEquals( b.getBalance(BankAccount.getAccountId()),55000));
	        		
	        	}
	}

}
