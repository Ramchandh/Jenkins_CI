package com.Jenk_test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestinJenkins {
	
	WebDriver driver;
	
	
	@Test 
	public void VeifyTitle()
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriv/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
	}
	

}
