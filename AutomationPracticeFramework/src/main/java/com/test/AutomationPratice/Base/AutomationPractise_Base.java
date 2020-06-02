package com.test.AutomationPratice.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractise_Base {

	public static WebDriver driver;
	public static Properties prop;

	public AutomationPractise_Base() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\eclipse-workspace\\AutomationPracticeFramework\\src\\main\\java\\com\\test\\AutomationPractise\\Config\\config.properties");
		prop = new Properties();
		prop.load(fis);

	}

	public void intialization() throws IOException {

		String browsername = prop.getProperty("browser");
		if (browsername.equals("Chrome")) {
			try {
				System.setProperty("webdriver.chrome.driver",
						"D:\\Automation\\chromedriver.exe");
				driver = new ChromeDriver();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (browsername.equals("firefox")) {
			try {
				System.setProperty("webdriver.ie.driver", "D:\\Automation\\IEDriverServer.exe");
				driver = new ChromeDriver();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (browsername.equals("Internet Explorer")) {
			try {
				System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
				driver = new ChromeDriver();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.navigate().to(prop.getProperty("test_url"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	public String returnTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void Imwait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
