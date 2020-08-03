package com.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {
	public static void main(String[] args) {
		
	  System.setProperty("webdriver.chrome.driver",  "./Driver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/popup.php");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//*[@target='_blank']")).click();
	  driver.findElement(By.xpath("//*[@target='_blank']")).click();
	  driver.findElement(By.xpath("//*[@target='_blank']")).click();
	  
	 
	String ParentWindow = driver.getWindowHandle();
	System.out.println("Patent window =" +driver.getWindowHandle());
	
	Set<String> allwindows = driver.getWindowHandles();
	System.out.println("Total window before loop" +driver.getWindowHandles());
    System.out.println("Total window before loop ="   +  allwindows.size());
	  
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	  
	  int i = 0;
	  for(String each : allwindows) {
		  System.out.println();
	 
	  }
	  
		  
	  }
	
	}


