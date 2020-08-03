package com.smoke.test;

import org.openqa.selenium.WebDriver;

import com.generic.code.BaseLogin;
import com.generic.code.BaseLogin1;
import com.generic.code.BaseLoginHW;





public class RunSmokeTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		driver=BaseLogin.getLogin();
	
   // driver= BaseLogin1.getlogin();
    
   // driver= BaseLoginHW.getLogin();
}
}