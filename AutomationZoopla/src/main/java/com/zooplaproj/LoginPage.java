package com.zooplaproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 public LoginPage(WebDriver driver){
	PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//*[@class='login']")
	private WebElement signBtn;
	@FindBy(xpath="//*[@id='email']")
	 private WebElement email;
	@FindBy(xpath="//*[@id='passwd']")
	 private	WebElement password;
	@FindBy(xpath="//*[@id='SubmitLogin']")
	private WebElement SubmitBtn;
	
	 
	 public WebElement getSignBtn() {
		return signBtn;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return SubmitBtn;
	}

	
}
