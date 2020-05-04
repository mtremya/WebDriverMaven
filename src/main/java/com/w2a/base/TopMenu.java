package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}

	public void gotoHome() {

	}

	public void gotoLeads() {

	}

	public void gotoContacts() {

	}

	public AccountsPage gotoAccounts() {

		//Page.driver.findElement(By.cssSelector("#mainMenuTabDiv > crm-menu > div.crmMenuLeft.fL > crm-tab > div.lyteMenuItems > div:nth-child(4) > a")).click();
		//driver.findElement(By.cssSelector("#mainMenuTabDiv > crm-menu > div.crmMenuLeft.fL > crm-tab > div.lyteMenuItems > div:nth-child(4) > a")).click();
		Page.click("accountsLink_CSS");
		return new AccountsPage();
	}

	public void gotoDeals() {

	}

	public void signOut() {

	}
}
