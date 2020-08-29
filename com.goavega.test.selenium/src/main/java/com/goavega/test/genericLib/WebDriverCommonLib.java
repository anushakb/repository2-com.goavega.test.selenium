package com.goavega.test.genericLib;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriverCommonLib extends BaseTest{
	
	
	
	public void waitForPageLoad(){
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		public void waitForElementVisibility(By locator) {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		public void waitForElementVisibility(WebElement element) {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public void waitForTitle(String title) {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleContains(title));
		}
		public String getPageTitle() {
			return driver.getTitle();
		}
		
		public void selectOption(WebElement element, String text)
		{
			Select sel= new Select(element);
			sel.selectByVisibleText(text);
		}
		
		public void mouseHover(WebElement element) {
			Actions ac=new Actions(driver);
			ac.moveToElement(element).perform();
		}
		public void photoUpload(String link) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].setAttribute('style', arguments[1])",driver.findElement(By.xpath("//input[@type='file']")), "0");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(link);
		}
		
		public void scrollBy(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("arguments[0].scrollIntoView(true);", element);
	
			}
		
		public void scrollBy() {
			JavascriptExecutor js1 = (JavascriptExecutor) driver; 
			js1.executeScript("window.scrollBy(0,1000)");
			// js.executeScript("document.getElementById('viewport').scrollTop += 100");
			}
		
		public void setValue(String date, WebElement element) {
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].value='date';", element);

			}
		
		public void verify(String actual,String expected, String pageName) {
		Assert.assertEquals(actual, expected);
		Reporter.log(pageName+" : is Displayed",true);
		Reporter.log("actual is Title "+actual,true);
		Reporter.log("expected is Title"+expected,true);
		}
		

}
