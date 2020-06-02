package com.test.AutomationPractise.Testpages;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.AutomationPractise.Pages.AT_Authentication;
import com.test.AutomationPractise.Pages.AT_ContactUs;
import com.test.AutomationPractise.Pages.AT_MyAccount;
import com.test.AutomationPractise.Pages.AT_Tshirt;
import com.test.AutomationPractise.Pages.AT_Women;
import com.test.AutomationPratice.Base.AutomationPractise_Base;

public class AT_MyAccountTest extends AutomationPractise_Base {

	AT_MyAccount my_page;
	AT_ContactUs objcontactUS; // T_ContactUs at_contact
	AT_Women at_women;
	AT_Tshirt at_tshirt;

	public AT_MyAccountTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setUp() throws IOException, AWTException {
		intialization();

	}

	@Test
	public void verifyClickUsername() throws AWTException, IOException {
		my_page.ClickUsername();
	}

	@Test
	public void verifySignout() {
		my_page.Signout();

	}

	@Test
	public void verifyclickWomen() {
		at_women = my_page.clickWomen();
	}

	@Test
	public void verifyclickTshirts() {

		at_tshirt = my_page.ClickTshirt();

	}

	@Test
	public void verifyclickCountUs() throws IOException {
		objcontactUS = my_page.clickCountUs(); // AT_ContactUs at_contact = new AT_ContactUs();

	}

}
