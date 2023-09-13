package com.united.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.united.qa.base.TestBase;
import com.united.qa.pages.HomePageAdmin;
import com.united.qa.pages.LoginPage;
import com.united.qa.util.TestUtil;

public class UlogoChatPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	TestUtil testUtil;
	
	public UlogoChatPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
		
		//homePageAdmin.clickChatTab();
		//testUtil.testWaitEight();
		//testUtil.testWaitEight();
		//homePageAdmin.clickChatCloseSign();
		//testUtil.testWaitFour();
		//homePageAdmin.clickCloseMenu();
		//testUtil.testWaitFour();
		
	}
	
	@Test
	public void chatPage() {
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
