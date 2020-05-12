package com.zooplaproj;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.util.Highlighter;
import com.util.TakeAppScreenShot;
import com.util.Wait;

public class BaseLoginHW {

public static void main(String[] args) throws Throwable {
	
    System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
	WebDriver driver = new ChromeDriver();//
	LoginPage login = new LoginPage(driver);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://automationpractice.com/index.php");
	
	System.out.println(driver.getTitle());
	WebElement signBtn = driver.findElement(By.xpath("// *[@class='login']"));
	new Highlighter().getcolor(driver, signBtn);
	signBtn.click();// click
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
	Wait.getExplicitWaitClicable(driver, login.getEmail());
	new Highlighter().getcolor(driver, email, "yellow");
	email.sendKeys("nayna0118@yahoo.com");
	
	WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
    new Highlighter().getcolor(driver, password,"black");
	password.sendKeys("Dz111213$");
	Thread.sleep(3000);
	
	WebElement loginBtn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
	loginBtn.click();

	System.out.println(driver.getTitle());
	
	//driver.quit();//= all browser tab + Chrome driver
	
}

}