package com.test.AutomationPractise.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AT_ShoppingCart {
	
	/******************ProceedTocheckoutPopUp************************************/
	
	
	@FindBy(xpath="//a[contains(@title,'Proceed to checkout')]")
	WebElement Acart_popupproceed;
	
	@FindBy(xpath="//span[contains(@title,'Continue shopping')]")
	WebElement Acart_continueshop;
	
	/********************ShoppingCart********************************************/

	@FindBy(xpath="//a[contains(@title,'Proceed to checkout')]")
	WebElement shopcart_summcheckout;
	
	@FindBy(xpath="//a[contains(@title,'Continue shopping')]")
	WebElement shopcart_summcontinue;
	
	@FindBy(xpath="//a[contains(@title,'Previous')]")
	WebElement shopcart_addcontinue;
	
	@FindBy(xpath="//input[(@id='cgv')]")
	WebElement shopcart_shipcheck;
	
	@FindBy(xpath="//button[(@type='submit' and @name='processCarrier')]")
	WebElement shopcart_shipcheckout;
	
	@FindBy(xpath ="//a[(@title='Previous' and @class='button-exclusive btn btn-default')]")
	WebElement shopcart_shipcontinue;
	
	@FindBy(xpath="//button[(@type='submit' and @class='button btn btn-default button-medium')]")
	WebElement shopcart_confirm;
	
	
	//Main xpath covered , But Few more are present which is not required at this time (30/04/2020)
	
	/*****************************************************************************/ 
	
	
	

}
