package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class LoginPage extends Page{
	
	
	
	public ZohoAppPage doLogin(String username, String password) {
		
		//driver.findElement(By.cssSelector("#login_id")).sendKeys(username);
		type("username_CSS" ,username);
		
		//driver.findElement(By.cssSelector("button.btn:nth-child(6)")).click();
		click("usernameNext_CSS");
		
		//Got a stale element reference
		//driver.findElement(By.cssSelector("#password")).sendKeys(password);
		
		//Due to the above error, added below code snippet
		boolean staleElement = true; 
		while(staleElement){
		  try{
			 //driver.findElement(By.cssSelector("#password")).sendKeys(password);
			  type("password_CSS" ,password);
		     staleElement = false;

		  } catch(StaleElementReferenceException e){
		    staleElement = true;
		  }
		}
		
		//driver.findElement(By.cssSelector("button.btn:nth-child(6)")).click();
		click("passwordNext_CSS");
		return new ZohoAppPage();
	}	
}
