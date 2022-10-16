package com.tester.introTester;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver webDriver;
	WebDriverWait webDriverWait;
	
	
	 public void login(String username, String password) {
	        webDriver.get("https://www.n11.com/");
	        Assert.assertEquals("n11.com - Hayat Sana Gelir",webDriver.getTitle());  // Control .get("https://www.n11.com")
	        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.className("btnSignIn"))).click();
	        Assert.assertEquals("Giriş Yap - n11.com",webDriver.getTitle()); // Control Login page
	        webDriver.findElement(By.id("email")).clear();                     //clear e-mail text area
	        webDriver.findElement(By.id("email")).sendKeys(username);         // write e-mail
	        webDriver.findElement(By.id("password")).clear();                //clear password text area
	        webDriver.findElement(By.id("password")).sendKeys(password);     // write password
	        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton"))).click();
	        Assert.assertEquals("n11.com - Hayat Sana Gelir",webDriver.getTitle());  // Control to Come back to Home page
	        //search();

	        //public void search() {}

	      

	        WebElement searchData = webDriver.findElement(By.id("searchData"));
	        searchData.sendKeys("Bilgisayar");
	        searchData.sendKeys(Keys.ENTER);

}
