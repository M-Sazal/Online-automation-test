package com.bitm.SeleniumOnlineProject.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverManager {

	static
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\msaza\\Desktop\\Selenium files\\Web Browser Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", 
				"C:\\\\Users\\\\msaza\\\\Desktop\\\\Selenium files\\\\Web Browser Drivers\\\\Firefoxdriver.exe");
	}
	
	public static WebDriver chdriver = new ChromeDriver();
	//public static WebDriver fxdriver = new FirefoxDriver();
	
	
	private DriverManager ()
	{
		
	}
	
	
	@Test
	public void DriverManagerTest()
	{
	System.out.println("Hello World");
	}
	
}
