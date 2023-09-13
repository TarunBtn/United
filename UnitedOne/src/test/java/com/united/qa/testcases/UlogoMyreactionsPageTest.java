package com.united.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.united.qa.base.TestBase;
import com.united.qa.pages.HomePageAdmin;
import com.united.qa.pages.LoginPage;
import com.united.qa.pages.UlogoMyreactionsPage;
import com.united.qa.util.TestUtil;

public class UlogoMyreactionsPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoMyreactionsPage uLogoMyreactionsPage;
	TestUtil testUtil;
	
	public UlogoMyreactionsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoMyreactionsPage=new UlogoMyreactionsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickMyReactionsTab();
		testUtil.testWaitFour();
		
	}
	
	@Test
	public void uLogoMyreactionsPageTest()throws Exception {
		uLogoMyreactionsPage.clickSuggestedResponses();
		testUtil.testWaitEight();
		uLogoMyreactionsPage.clickMyRunningReactions();
		testUtil.testWaitEight();
		uLogoMyreactionsPage.clickResponseHistory();
		testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
