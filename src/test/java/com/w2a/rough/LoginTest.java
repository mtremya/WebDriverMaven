package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {
		
				
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		ZohoAppPage apps = login.doLogin("mt.remya@gmail.com", "autotest123");
	    apps.gotoCRM();
	    AccountsPage account = Page.menu.gotoAccounts();
	    CreateAccountPage cap = account.gotoCreateAccount();
		cap.createAccount("Dileep");
	}

}
