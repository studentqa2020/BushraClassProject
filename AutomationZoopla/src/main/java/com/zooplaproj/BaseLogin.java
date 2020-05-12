package com.zooplaproj;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.config.BaseConfig;
import com.login.automation.demo.LoginPage;
import com.util.Highlighter;
import com.util.TakeAppScreenShot;
import com.util.Wait;

public class BaseLogin {

  public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(BaseConfig.getconfig("URL"));
		
		LoginPage login = new LoginPage(driver);
		System.out.println(driver.getTitle());
		//WebElement signBtn = driver.findElement(By.xpath("// *[@class='login']"));
		new Highlighter().getcolor(driver,login.getLoginBtn());
		login.getLoginBtn().click();// click
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		Wait.getExplicitWaitClicable(driver, login.getEmail());
		//new Highlighter().getcolor(driver, email, "yellow");
		new Highlighter().getcolor(driver, login.getEmail(), "yellow");
		//email.sendKeys("nayna0118@yahoo.com");
		login.getEmail().sendKeys(BaseConfig.getconfig("email"));
		
		//WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
	    new Highlighter().getcolor(driver, login.getEmail(),"black");
		//password.sendKeys("Dz111213$");
	    login.getPassword().sendKeys(BaseConfig.getconfig("pass"));
		Thread.sleep(3000);
		
		//WebElement loginBtn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		login.getSignBtn().click();
		//loginBtn.click();
        TakeAppScreenShot.captureScreenShot(driver, "login success");
		System.out.println(driver.getTitle());
		
		//driver.quit();//= all browser tab + Chrome driver
		
	}

}