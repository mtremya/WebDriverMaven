package com.w2a.pages;

import org.openqa.selenium.By;


import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage  extends Page{

		
	public void gotoBooks() {
		//driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[1]/div/a/div")).click();
		click("gotoBooksLink_XPATH");
	}
	
	public CRMHomePage gotoCRM() {
		//driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[6]/div/a/div")).click();
		click("gotoCRMLink_XPATH");
		return new CRMHomePage();
	}
	
	public void gotoCampaigns() {
		
		//driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[3]/div/a/div")).click();
		click("gotoCampaign_XPATH");
	}
	
}
