package com.goavega.test.objectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goavega.test.genericLib.WebDriverCommonLib;

public class UserPage {

	@FindBy(xpath="//input[@id='menu-open']/following::label[@for='menu-open']") private WebElement plusIcon;
	
	public WebElement getPlusIcon() {
		return plusIcon;
	}
	
	WebDriverCommonLib wb= new WebDriverCommonLib();
	public void clickPlusIcon() {
		wb.waitForElementVisibility(plusIcon);
		plusIcon.click();
	}
	
	@FindBy(xpath="//a[@id='lnkCreateUser']") private WebElement createUsr;
	public WebElement getCreateUsr() {
		return createUsr;
	}
	
	public void clickCreateUsr() {
		createUsr.click();
	}
	
	
	@FindBy(xpath="//nav[@class='menu']/label") private WebElement addUser;
	public WebElement getaddUser() {
		return addUser;
	}
	public void clickAddUser() {
		addUser.click();
	}
	
	@FindBy(id="FirstName") private WebElement firstName;
	public WebElement getfirstName() {
		return firstName;
	}
	
	public void setfirstName() {
		firstName.sendKeys("Anusha");
	}
	
	@FindBy(id="LastName") private WebElement lastName;
	public WebElement getlastName() {
		return lastName;
	}
	
	public void setlastName() {
		wb.waitForElementVisibility(lastName);
		lastName.sendKeys("KB");
	}
	
	@FindBy(id="UserName") private WebElement userName;
	public WebElement getuserName() {
		return userName;
	}
	
	public void setuserName() {
		userName.sendKeys("Anusha123u43");
	}
	
	
	@FindBy(id="EmailAddress") private WebElement emailid;
	public WebElement getemailid() {
		return emailid;
	}
	
	public void setemailid() {
		emailid.sendKeys("anushakb2020@gmail.com");
		//wb.scrollBy(country);
	}
	
	
	
	@FindBy(xpath="//label[contains(text(),'Email Address')]") private WebElement emailidLabel;
	public WebElement getemailidLabel() {
		return emailidLabel;
	}
	
	public void setemailidLabel() {
		emailidLabel.click();
		System.out.println("label clicked");
		//wb.scrollBy(country);
	}
	
	
	@FindBy(id="//label[contains(text(),'Country')]//following::select") private WebElement country;
	public WebElement getCountry() {
		return country;
	}
	
	
	public void setCountry() {
		System.out.println(country.getLocation());
		wb.mouseHover(country);
		
		wb.selectOption(country,"Algeria");
	}
		
	@FindBy(id="//label[contains(text(),'State')]//following::select") private WebElement state;
	public WebElement getState() {
		return state;
	}
	
	public void setState() {
		wb.selectOption(state,"Blidah");
	}
	
	@FindBy(id="//label[contains(text(),'City')]//following::input[1]") private WebElement city;
	public WebElement getCity() {
		return city;
	}
	
	public void setCity() {
		city.sendKeys("Bng");
	}

	@FindBy(id="//label[contains(text(),'Zip Code')]//following::input[1]") private WebElement postal;
	public WebElement getPostal() {
		return postal;
	}
	
	public void setPostal() {
		postal.sendKeys("560071");
	}
	
	
	@FindBy(id="//textarea[@class='form-control']") private WebElement addr;
	public WebElement getAddr() {
		return addr;
	}
	
	public void setAddr() {
		addr.sendKeys("Bangalore");
	}


	@FindBy(id="//label[contains(text(),'Radio1')]//following::input[1]") private WebElement rdBtn;
	public WebElement getRdBtn() {
		return rdBtn;
	}
	
	public void setRdBtn() {
		rdBtn.click();
	}

	@FindBy(id="//a[@id='btnCreateUser']") private WebElement saveBtn;
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void setSaveBtn() {
		saveBtn.click();
	}
	
	@FindBy(id="//label[contains(text(),'Account Expiry Date')]//following::input[1]") private WebElement expDate;
	public WebElement getExpDate() {
		return expDate;
	}
	
	public void setExpDate() {
		
	//	wb.scrollBy(expDate);
		//expDate.click();
	//	expDate.sendKeys("08/29/2020");
		System.out.println("Before set date");
		wb.setValue("08/29/2020", expDate);
		
	}
	
	@FindBy(id="//label[contains(text(),'Account Expiry Date')]") private WebElement expDateLab;
	public WebElement getExpDateLab() {
		return expDateLab;
	}
	
	public void setExpDateLab() {
			expDateLab.click();
	}
	
	@FindBy(id="//div[@id='searchAvailableGroups']//child::a") private WebElement grpSrch;
	public WebElement getGrpSrch() {
		return grpSrch;
	}
	
	public void clickGrpSrch() {
		grpSrch.click();
	}
	
	@FindBy(id="//div[@id='searchAvailableGroups']//child::a") private WebElement searchMagnifi;
	public WebElement getSearchMagnifi() {
		return searchMagnifi;
	}
	
	public void setSearchMagnifi() {
		searchMagnifi.sendKeys("searchMagnifi");
	}

	@FindBy(id="//div[@id='available-group-cards']") private WebElement magnifiGrpTest;
	public WebElement getmagnifiGrpTest() {
		return magnifiGrpTest;
	}
	
	public void clickmagnifiGrpTest() {
		magnifiGrpTest.click();
	}
	
	 
	@FindBy(id="//a[@id='pickSelectedGroups']") private WebElement pickGroups;
	public WebElement getpickGroups() {
		return pickGroups;
	}
	
	public void clickpickGroups() {
		pickGroups.click();
	}
	 

	@FindBy(id="//a[contains(text(),'Finish')]") private WebElement finish;
	public WebElement getfinish() {
		return finish;
	}
	
	public void clickfinish() {
		finish.click();
	}
	
	public void setPhoto() {
		wb.photoUpload("C:\\Users\\Gubbi\\Desktop\\goavega.PNG");
	}
	
	

		public void useraccount() throws InterruptedException{
		clickPlusIcon();
		clickCreateUsr();
		setPhoto();
		setfirstName();
		setlastName();
		setuserName();
		setemailid();
		setemailidLabel();
		System.out.println("JSE -date ");
		
		Thread.sleep(10000);
		//setExpDateLab();
		setExpDate();
		setCountry();
		Thread.sleep(10000);
		setState();
		setCity();
		setPostal();
		setAddr();
		setRdBtn();
		setSaveBtn();
		clickGrpSrch();
		setSearchMagnifi();
		clickmagnifiGrpTest();
		clickpickGroups();
		clickfinish();	
		
		}
	
	
	public UserPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}
