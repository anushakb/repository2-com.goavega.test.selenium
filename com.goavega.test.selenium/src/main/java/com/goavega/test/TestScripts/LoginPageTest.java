package com.goavega.test.TestScripts;

import org.testng.annotations.Test;

import com.goavega.test.genericLib.BaseTest;
import com.goavega.test.genericLib.FileLib;
import com.goavega.test.genericLib.WebDriverCommonLib;
import com.goavega.test.objectRepository.LoginPage;

public class LoginPageTest extends BaseTest{

	@Test
	public void LoginPageTest() throws Throwable{
		LoginPage lp =	new LoginPage(driver);
		
		FileLib flib=new FileLib();
		//Login with Valid Credentials
		lp.login(flib.getPropValue(PROP_PATH, "username"),flib.getPropValue(PROP_PATH, "password"));
		Thread.sleep(5000);
		//WebDriverCommonLib wlib=new WebDriverCommonLib();
	///	wlib.waitForTitle(flib.getPropValue(PROP_PATH, "eHomeTitle"));
		
	//	wlib.verify(wlib.getPageTitle(), flib.getPropValue(PROP_PATH, "eHomeTitle"), "Home Page");
		
}
}