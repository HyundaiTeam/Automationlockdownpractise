package com.test.AutomationPractise.Reports;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class AutomationPractise_ReportGenerater {
	
static WebDriver driver;
	
	public static void extentReportGenerate() throws IOException {
		// TODO Auto-generated method stub

		/*
		 * what is extent report:
		 * its a html report in library
		 * Open source rreporting api for java and .net
		 * it create interactive html report of your test sessions
		 */


		//Starting  the report as a html file
		/*
		 * Is it possible to store in a share path
		 * 
		 * 
		 */

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./report/mainreport.html");

		//attaching the html report into extent report
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	

		ExtentTest test = extent.createTest("TC001", "Google launch verification");
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//snapShot();

		
		
		test.log(Status.PASS, "Chrome Launched successfully",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		test.addScreenCaptureFromPath("screenshot.png");
		test.assignAuthor("Sabitha");
		test.assignCategory("Regression");
		extent.flush();
		driver.quit();
}

}
