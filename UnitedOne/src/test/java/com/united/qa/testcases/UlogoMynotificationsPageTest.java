package com.united.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.united.qa.base.TestBase;
import com.united.qa.pages.HomePageAdmin;
import com.united.qa.pages.LoginPage;
import com.united.qa.pages.UlogoMynotificationsPage;
import com.united.qa.util.TestUtil;

public class UlogoMynotificationsPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoMynotificationsPage uLogoMynotificationsPage;
	TestUtil testUtil;
	
	public UlogoMynotificationsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		uLogoMynotificationsPage=new UlogoMynotificationsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitTwo();
		//homePageAdmin.clickMynotificationsTab();
		//testUtil.testWaitFour();
		
	}
	
	@Test
	public void myNotificationsPage()throws Exception {
		//uLogoMynotificationsPage.ClickToOpenMail();
		//testUtil.testWaitEight();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
