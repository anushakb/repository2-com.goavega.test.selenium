package com.goavega.test.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.goavega.test.genericLib.WebDriverCommonLib;

public class HomePage {
	WebDriverCommonLib wb= new WebDriverCommonLib();
	@FindBy(xpath="//a[@title='Users Page']") 	private WebElement UsersCategory;
	public WebElement getUsersCategory() {
		return UsersCategory;
	}
			
	public void clickUsersCategory() {
		
		wb.waitForElementVisibility(UsersCategory);
		wb.mouseHover(UsersCategory);
	}
	
	@FindBy(xpath="//a[@data-currentpage='users']") private WebElement users;
	public WebElement getUsers() {
		return users;
	}
	
	public void clickUsers() {
		users.click();
	}
	
	
	
			
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}
