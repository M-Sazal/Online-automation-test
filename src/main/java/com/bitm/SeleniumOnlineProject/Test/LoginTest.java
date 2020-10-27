package com.bitm.SeleniumOnlineProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.UrlTextUtils;
import com.bitm.SeleniumOnlineProject.Utils.XpathUtils;


public class LoginTest {

	
	private static WebDriver chdriver=null;
	//private static WebDriver fxdriver=null;
	
	@Test
	public void CheckLoginPageTitle() {
		chdriver=DriverManager.chdriver;
		chdriver.get(UrlTextUtils.Url.Base_URL);
		//fxdriver=DriverManager.fxdriver;
		//fxdriver.get(UrlTextUtils.Url.Base_URL);
		Assert.assertEquals(chdriver.getTitle(), UrlTextUtils.Text.LoginPageTitle);
		System.out.println("Login page title matched");	
	}
	@Test(dependsOnMethods = "CheckLoginPageTitle")
	public void Login ()
	{
		chdriver.findElement(By.xpath(XpathUtils.LoginXpath.user_name)).sendKeys("Admin");
		chdriver.findElement(By.xpath(XpathUtils.LoginXpath.password)).sendKeys("admin123");
		chdriver.findElement(By.xpath(XpathUtils.LoginXpath.loginbtn)).click();
				
	}
	
	
}
