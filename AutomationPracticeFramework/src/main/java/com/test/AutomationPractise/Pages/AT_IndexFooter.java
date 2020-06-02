package com.test.AutomationPractise.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AT_IndexFooter {
	@FindBy(xpath="(//a[contains(text(),'Women')])[2]")
	WebElement Footer_Women;
	
	@FindBy(xpath="//a[@title='Specials']")
	WebElement Footer_Specials;
	
	@FindBy(xpath="//a[@title='New products']")
	WebElement Footer_NewProducts;
	
	@FindBy(xpath="//a[@title='Best sellers']")
	WebElement Footer_BestSeller;
	
	@FindBy(xpath="//a[@title='Our stores']")
	WebElement Footer_OurStores;
	
	@FindBy(xpath="//a[@title='Contact us']")
	WebElement Footer_ContactUS;
	
	@FindBy(xpath="//a[contains(text(),'Terms and conditions of use')]")
	WebElement Footer_TermCondition;
	
	@FindBy(xpath="//a[@title='About us']")
	WebElement Footer_AboutUS;
	
	@FindBy(xpath="//a[@title='Sitemap']")
	WebElement Footer_SiteMap;
	
	@FindBy(xpath="//a[text()='My orders']")
	WebElement Footer_MyOrder;
	
	@FindBy(xpath="//a[text()='My credit slips']")
	WebElement Footer_MyCreditSlips;
	
	@FindBy(xpath="//a[text()='My addresses']")
	WebElement Footer_MyAddresses;
	
	@FindBy(xpath="//a[text()='My personal info']")
	WebElement Footer_MyPersonalInfo;
	
	@FindBy(xpath="//li[@class='facebook']")
	WebElement Footer_Facebook;
	
	@FindBy(xpath="//li[@class='twitter']")
	WebElement Footer_Twitter;
	
	@FindBy(xpath="//li[@class='youtube']")
	WebElement Footer_Youtube;
	
	@FindBy(xpath="//li[@class='google-plus']")
	WebElement Footer_GooglePlus;
	
	
	@FindBy(xpath="//a[contains(text(),'Ecommerce software by PrestaShop')]")
	WebElement Footer_Ecommerce;

	

}
