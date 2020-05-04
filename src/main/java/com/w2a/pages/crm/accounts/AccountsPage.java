package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page{

	
	public CreateAccountPage gotoCreateAccount() {
		//menu.signOut();
		
		//driver.findElement(By.xpath("//*[@id=\"topRightIcons\"]/span[1]/link-to/button")).click();
		click("createAccount_XPATH");
		return new CreateAccountPage();
	}
	
	public void gotoImportAccounts() {
		
	}
}
