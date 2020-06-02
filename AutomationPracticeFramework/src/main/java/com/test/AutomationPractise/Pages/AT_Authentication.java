package com.test.AutomationPractise.Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.AutomationPratice.Base.AutomationPractise_Base;
import com.test.AutomationPratice.Base.AutomationPractise_CommonComponents;

public class AT_Authentication extends AutomationPractise_Base {

	/******************* RegistrationPage *******************/

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement Index_Signin;

	@FindBy(xpath = "//input[@id='email_create']")
	WebElement Reg_email;

	@FindBy(xpath = "//button[@id='SubmitCreate']")
	WebElement Reg_create;

	@FindBy(xpath = "//input[@id='customer_firstname']")
	WebElement Reg_firstname;

	@FindBy(xpath = "//input[@id='customer_lastname']")
	WebElement Reg_lastname;

	@FindBy(xpath = "//input[@id='passwd']")
	WebElement Reg_passwrd;

	@FindBy(xpath = "//select[@id='days']")
	WebElement Reg_dobday;

	@FindBy(xpath = "//select[@id='months']")
	WebElement Reg_months;

	@FindBy(xpath = "//select[@id='years']")
	WebElement Reg_years;

	@FindBy(xpath = "//input[@id='company']")
	WebElement Reg_company;

	@FindBy(xpath = "//input[@id='address1']")
	WebElement Reg_address1;

	@FindBy(xpath = "//input[@id='address2']")
	WebElement Reg_address2;

	@FindBy(xpath = "//input[@id='city']")
	WebElement Reg_city;

	@FindBy(xpath = "//select[@id='id_state']")
	WebElement Reg_state;

	@FindBy(xpath = "//input[@id='postcode']")
	WebElement Reg_postcode;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement Reg_landphone;

	@FindBy(xpath = "//input[@id='phone_mobile']")
	WebElement Reg_mobile;

	@FindBy(xpath = "//input[@id='alias']")
	WebElement Reg_alias;

	@FindBy(xpath = "//textarea[@id='other']")
	WebElement Reg_others;

	@FindBy(xpath = "//button[@id='submitAccount']")
	WebElement Reg_sumbit;

	/*********************** LoginPage ***********************************/

	@FindBy(xpath = "//input[@id='email']")
	WebElement login_email;

	@FindBy(xpath = "//input[@id='passwd']")
	WebElement login_passsword;

	@FindBy(xpath = "//button[@id='SubmitLogin']")
	WebElement login_signin;

	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	WebElement login_forgotpasswd;

	@FindBy(xpath="//div[@class='alert alert-danger']")
	WebElement login_errortext;
	
	/************************* ForgotPassword Page ********************************/

	@FindBy(xpath = "//button[@type='submit' and @class='btn btn-default button button-medium']")
	WebElement for_submit;

	@FindBy(xpath = "//input[@id='email']")
	WebElement for_email;

	@FindBy(xpath = "//a[contains(@title,'Back to Login')]")
	WebElement for_backhome;

	public AT_Authentication() throws AWTException, IOException {
		PageFactory.initElements(driver, this);
	}

	public AT_MyAccount registration(String emailId, String firstName, String lastName, String password, String company,
			String address1, String address2, String city, String postCode, String landPhone, String mobile,
			String alias, String others) throws AWTException, IOException {

		Index_Signin.click();
		Reg_email.sendKeys(emailId);
		Reg_create.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reg_firstname.sendKeys(firstName);
		Reg_lastname.sendKeys(lastName);
		Reg_passwrd.sendKeys(password);
		Select selecdrop = new Select(Reg_dobday);
		selecdrop.selectByValue("5");
		Select selecdropA = new Select(Reg_months);
		selecdropA.selectByValue("5");
		Select selecdropB = new Select(Reg_years);
		selecdropB.selectByValue("1996");
		Reg_company.sendKeys(company);
		Reg_address1.sendKeys(address1);
		Reg_address2.sendKeys(address2);
		Reg_city.sendKeys(city);
		Select selectdropC = new Select(Reg_state);
		selectdropC.selectByValue("8");
		Reg_postcode.sendKeys(postCode);
		Reg_landphone.sendKeys(landPhone);
		Reg_mobile.sendKeys(mobile);
		Reg_alias.sendKeys(alias);
		Reg_others.sendKeys(others);
		Reg_sumbit.click();
		return new AT_MyAccount(); 
	}
		
	public AT_MyAccount login(String email, String password) throws AWTException, IOException {
		
		login_email.sendKeys(email);
		login_passsword.sendKeys(password);
		login_signin.click();
		return new AT_MyAccount();
	}
	
	public String RegistrationPagetitle() {
		return returnTitle();		
	}
	
	public boolean Checkbuttonenabled() {
		boolean value=login_signin.isEnabled();
		return value;
	}
	
	public String errorValidation(String email) {
		login_email.sendKeys(email);
		login_passsword.clear();
		login_signin.click();
		String errortext = login_errortext.getText();
		return errortext;
	}
	
	public void forgotPassword(String email)
	{
		login_forgotpasswd.click();
		for_email.sendKeys(email);
		for_submit.click();
		for_backhome.click();		
	}
	
	//How to Validate error meesage scenario . 
	//Why we are return Objects 
	//
	  
}




