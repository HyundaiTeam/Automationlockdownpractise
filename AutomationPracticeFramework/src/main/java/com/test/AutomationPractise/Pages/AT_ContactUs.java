package com.test.AutomationPractise.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.AutomationPratice.Base.AutomationPractise_Base;

public class AT_ContactUs extends AutomationPractise_Base {
	


	public AT_ContactUs() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//select[@id='id_contact']")
	WebElement ConUsIn_type;
	
	@FindBy(xpath="//textarea[@id='message']")
	WebElement ConUsIn_textarea;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement ConUsIn_email;
	
	@FindBy(xpath="//input[@id='id_order']")
	WebElement ConUsIn_order;
	
	
	@FindBy(xpath="//button[@id='submitMessage']")
	WebElement ConUsIn_submit;
	
	@FindBy(xpath="//li//a[@class='btn btn-default button button-small']")
	WebElement ConUsIn_home;
	
	
	@FindBy(xpath="//input[@id='fileUpload']")
	WebElement ConUsIn_fileUpload;
	
	@FindBy(xpath="//span[text()='Choose File']")
	WebElement ConUsIn_chooseFile;
	
	
	public void contactUsFillForm(String comment,String emailId,String order) {
		
		Select selecdrop = new Select(ConUsIn_type);
		selecdrop.selectByValue("2");
		
		ConUsIn_textarea.sendKeys(comment);
		
		ConUsIn_email.sendKeys(emailId);
		
		ConUsIn_order.sendKeys(order);
		ConUsIn_fileUpload.sendKeys("D:\\Automation\\TextContactUs.txt");
		ConUsIn_submit.click();
		
		//ConUsIn_chooseFile.click();
		
		
	}
	


	
	
	
}
