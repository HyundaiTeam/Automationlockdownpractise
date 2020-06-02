package com.test.AutomationPractise.Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.test.AutomationPratice.Base.AutomationPractise_Base;

public class AutomationPractise_PropertyReader {

	public static Properties prop;

	public AutomationPractise_PropertyReader() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\eclipse-workspace\\AutomationPracticeFramework\\src\\main\\java\\com\\test\\AutomationPractise\\Config\\config.properties");
		prop = new Properties();
		prop.load(fis);
	}

	
	public static void main(String[] args) throws IOException {
		AutomationPractise_PropertyReader st= new AutomationPractise_PropertyReader();
		System.out.println(AutomationPractise_PropertyReader.prop.getProperty("browser"));
		System.out.println("Helloare u alive");
}

}