package com.test.AutomationPractise.Testpages;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.AutomationPractise.Pages.AT_ContactUs;
import com.test.AutomationPratice.Base.AutomationPractise_Base;

public class AT_ContactUsTest extends AutomationPractise_Base {
	

	AT_ContactUs objcontactUS;


	public AT_ContactUsTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod
	
	public void startApp() throws IOException {
		
		intialization();
		
		 objcontactUS = new AT_ContactUs();
		
	}
	
	@Test
	
	public void fillFormContactUs() {
		
		objcontactUS.contactUsFillForm("Automation test", "muthukkr@yahoo.com", "121");
		
	}
	
	@AfterMethod

	public static void tearDown()

	{
		driver.close();
	}
	

	
	
}


