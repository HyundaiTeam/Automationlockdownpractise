package com.test.AutomationPractise.Testpages;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.AutomationPractise.Pages.AT_Authentication;
import com.test.AutomationPractise.Pages.AT_MyAccount;
import com.test.AutomationPratice.Base.AutomationPractise_Base;

public class AT_AutheticationTest extends AutomationPractise_Base {

	public AT_Authentication at_page;
	public  AT_MyAccount my_page;

	public AT_AutheticationTest() throws IOException, AWTException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException, AWTException {
		intialization();
		at_page = new AT_Authentication();
	}

	@Test

	public void verifyRegistration(String emailId, String firstName, String lastName, String password, String company,
			String address1, String address2, String city, String postCode, String landPhone, String mobile,
			String alias, String others) throws AWTException, IOException {

		at_page.Imwait();
		my_page = at_page.registration("muthukkr@yahoo.com", "Muthu", "Kumar", "Password1", "Cts", "add", "add1",
				"California", "92614", "22218975", "9878909876", "test", "testAutomation"); // KeywordDriven

		/*
		 * at_page.registration(emailId, firstName, lastName, password, company,
		 * address1, address2, city, postCode, landPhone, mobile, alias, others);
		 */// DataDriver
	}

	@Test
	public void verifysign() throws AWTException, IOException {
		at_page.Imwait();
		my_page = at_page.login("muthukkr@yahoo.com", "Password1");
	}

	@AfterMethod
	public void closeTest() {
		driver.quit();

	}

}
/*
 * Implementain , screenshot , excellData Extenete Log4japi Assertions, Listerners , How to run via testng.xml
 */
