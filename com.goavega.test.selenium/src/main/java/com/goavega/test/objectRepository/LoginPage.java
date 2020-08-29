package com.goavega.test.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="Email") private WebElement untb;
	public WebElement getUntb() {
		return untb;
	}
	
	public void setUntb(String un){
		untb.sendKeys(un);
	}
	
	@FindBy(id="Password") private WebElement pwtb;
	public WebElement getPwtb(){
		return pwtb;
	}
	public void setPwtb(String pwd){
		pwtb.sendKeys(pwd);
	}
	
	@FindBy(xpath="//button[.='Login']") private WebElement loginBtn;
	public WebElement getLoginBtn(){
		return loginBtn;
	}
	
	public void clickLoginBtn(){
		loginBtn.click();
	}
	
	
	public void login(String un, String pwd) throws InterruptedException{
		untb.sendKeys(un);
		Thread.sleep(2000);
		pwtb.clear();
		Thread.sleep(2000);
		pwtb.sendKeys(pwd);
		
		Thread.sleep(2000);
		loginBtn.click();
		}
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
}
