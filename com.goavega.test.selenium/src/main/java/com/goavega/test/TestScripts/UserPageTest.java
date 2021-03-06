package com.goavega.test.TestScripts;

import java.util.Base64;

import org.testng.annotations.Test;

import com.goavega.test.genericLib.BaseTest;
import com.goavega.test.genericLib.FileLib;
import com.goavega.test.genericLib.WebDriverCommonLib;
import com.goavega.test.objectRepository.HomePage;
import com.goavega.test.objectRepository.LoginPage;
import com.goavega.test.objectRepository.UserPage;

public class UserPageTest extends BaseTest {
	
	
	@Test
	public void HomePageTest() throws Throwable{
	LoginPage lp =	new LoginPage(driver);
	FileLib flib=new FileLib();
	
	lp.login(flib.getPropValue(PROP_PATH, "username"),flib.getPropValue(PROP_PATH, "password"));
				
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.waitForTitle(flib.getPropValue(PROP_PATH, "eHomeTitle"));
	wlib.verify(wlib.getPageTitle(), flib.getPropValue(PROP_PATH, "eHomeTitle"), "Home Page");
	
	HomePage hp =new HomePage(driver);
	hp.clickUsersCategory();
	hp.clickUsers();
	
	
	UserPage up= new UserPage(driver);
	
	up.useraccount();
	
}
}

