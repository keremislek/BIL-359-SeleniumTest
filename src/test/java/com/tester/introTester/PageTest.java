package com.tester.introTester;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class PageTest {
	
	public WebDriver driver;
	
	
	public void beforeCreateWebDriver() {
		DesiredCapabilities capabilities= new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	
	public void afterQuitWebDriver() {
		driver.quit();
	}
	
	
	
	
}
