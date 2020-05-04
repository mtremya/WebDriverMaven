package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class HomePage extends Page{

	
		
	public void goToSignUp() {
		//driver.findElement(By.cssSelector(".zh-signup")).click();
		click("signUp_CSS");
	}
	
	public LoginPage goToLogin() {
		
		//driver.findElement(By.cssSelector(".zh-login")).click();
		click("login_CSS");
		return new LoginPage();
	}
	
	public void goToSupport() {
		//driver.findElement(By.cssSelector(".zh-support")).click();
		click("support_CSS");
	}
	
	/* The link is no longer available
	public void goToZohoEdu() {
		
	}
	
	public void goToLeanrMore() {
		
	}
	*/
	
	public void validateFooterLinks() {
		
	}
}
