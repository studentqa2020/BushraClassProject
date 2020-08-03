package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SelemiumFinalPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "./Driver/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);// upcasting
		driver.manage().window().maximize();//all the time
		driver.get("https://www.facebook.com/");
		System.out.println("Title of my current page :: "+driver.getTitle());
		System.out.println("URL of my Current Page :: "+driver.getCurrentUrl());
		driver.get("https://www.google.com/");
		System.out.println("Title of my current page :: "+driver.getTitle());
		System.out.println("URL of my Current Page :: "+driver.getCurrentUrl());
		
		WebDriverWait wait = new WebDriverWait(driver,30);
	    //wait.until(ExpectedConditions.visibility)
		
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage()
//		driver.get("https://www.facebook.com/");
	}
	
}
