package com.test.AutomationPratice.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractise_CommonComponents extends AutomationPractise_Base {

	public static WebDriver driver;
	public Actions act;
	public WebElement element;
	public Robot robo;
	public Select selecdrop;

	public AutomationPractise_CommonComponents() throws AWTException, IOException {
        super();
		act = new Actions(driver);
		robo = new Robot();
	}

	public WebElement findByxpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public void selectindex(String xpath, int index) {
		element = driver.findElement(By.xpath(xpath));
		Select selecdrop = new Select(element);
		selecdrop.selectByIndex(index);
	}

	public void selectvalue(String xpath, String value) {
		element = driver.findElement(By.xpath(xpath));
		Select selecdrop = new Select(element);
		selecdrop.selectByValue(value);
	}

	public void selectVisibleText(String xpath, String text) {
		element = driver.findElement(By.xpath(xpath));
		selecdrop = new Select(element);
		selecdrop.selectByVisibleText(text);
		
	}

	public void movetoElementClick(String xpath) {
		element = driver.findElement(By.xpath(xpath));
		act.moveToElement(element).click().perform();
	}

	public void clickAndHond(String xpath) {
		element = driver.findElement(By.xpath(xpath));
		act.moveToElement(element).clickAndHold().perform();
	}

	public void doubleClick(String xpath) {
		element = driver.findElement(By.xpath(xpath));
		act.moveToElement(element).doubleClick().perform();
	}

	public void contextclick(String xpath) {
		element = driver.findElement(By.xpath(xpath));
		act.moveToElement(element).contextClick().perform();
	}

	public void middleofElement(String xpath) {
		element = driver.findElement(By.xpath(xpath));
		act.contextClick(element).perform();
	}

	public void dragDrop(String xpath_a, String xpath_b) {
		WebElement src_element, desc_element;
		src_element = driver.findElement(By.xpath(xpath_a));
		desc_element = driver.findElement(By.xpath(xpath_b));
		act.dragAndDrop(src_element, desc_element);
	}

	public void release() {
		act.release().build().perform();
	}

// Pending -movetoelementof offset

	/**************************************************************************************/

	public void scrollUp(int value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0", +value + ")", "");
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

	public void scrollhorizon(String xpath) {
		element = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	/*
	 * public void windowHandles() { Set<String>
	 * babywindow=driver.getWindowHandles(); java.util.Iterator<String>
	 * it=babywindow.iterator(); if(it.hasNext()) {
	 */

}
