package com.goavega.test.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConst{

public static WebDriver driver;
	
	@BeforeClass
	public void openBrowserEnterUrl() throws Throwable
	{
		FileLib flib=new FileLib();
	
		String browser=flib.getPropValue(PROP_PATH, "browser");
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		else 
		{
			System.out.println("Enter proper browser");
		}
		driver.manage().window().maximize();
		String appUrl=flib.getPropValue(PROP_PATH, "url");
		driver.get(appUrl);
		
		}
	
	@AfterClass(enabled=true )
	public void closeBrowser() 
	{
		driver.quit();
	}

	
}
