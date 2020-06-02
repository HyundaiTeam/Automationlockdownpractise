package com.test.AutomationPractise.Pages;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.AutomationPratice.Base.AutomationPractise_Base;

public class AT_MyAccount extends AutomationPractise_Base {

	@FindBy(xpath = "//a[@title='Contact Us']")
	WebElement ConUsIn_contactus;

	@FindBy(xpath = "//a[@class='logout']")
	WebElement account_signout;

	@FindBy(xpath = "//a[@class='account' and @title='View my customer account']")
	WebElement account_profile;

	@FindBy(xpath = "//img[@class='logo img-responsive']")
	WebElement account_logo;

	@FindBy(xpath = "//a[@title='Orders']")
	WebElement account_ordershis;

	@FindBy(xpath = "//a[@title='Credit slips']")
	WebElement account_creditslips;

	@FindBy(xpath = "//a[@title='Addresses']")
	WebElement account_address;

	@FindBy(xpath = "//a[@title='Information']")
	WebElement account_profileInformation;

	@FindBy(xpath = "//a[@title='My wishlists']")
	WebElement account_wishlist;

	@FindBy(xpath = "//i[@class='icon-chevron-left']")
	WebElement account_home;

	@FindBy(xpath = "//a[@title='View my shopping cart']")
	WebElement cart;

	@FindBy(xpath = "//a[@title='Women']")
	WebElement account_women;

	@FindBy(xpath = "(//a[@title='Dresses' and @class='sf-with-ul'])[1]")
	WebElement account_dresses;

	@FindBy(xpath = "(//a[@title='T-shirts' ])[1]")
	WebElement account_tshirt;

	public AT_MyAccount() throws AWTException, IOException {
		PageFactory.initElements(driver, this);
	}

	public AT_ContactUs clickCountUs() throws IOException {
		ConUsIn_contactus.click();
		return new AT_ContactUs(); //  new AT_ContactUs();
	}

	public AT_IndexFooter Signout() {

		account_signout.click();
		return new AT_IndexFooter();
	}

	public AT_MyAccount ClickUsername() throws AWTException, IOException {
		account_profile.click();
		return new AT_MyAccount();

	}

	public AT_Women clickWomen() {
		account_women.click();
		return new AT_Women();
	}

	public AT_Tshirt ClickTshirt() {
		account_tshirt.click();
		return new AT_Tshirt();
	}

}

/*
 * * OrderHistory page --Order history clcik credit - credit slips My
 * Addeerss-Page my personalinformation - my profile my wishlist ---wishlist
 * page click home ---Home page
 */
