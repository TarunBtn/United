package com.united.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.united.qa.base.TestBase;
import com.united.qa.pages.HomePageAdmin;
import com.united.qa.pages.LoginPage;
import com.united.qa.pages.UlogoAllassignmentsPage;
import com.united.qa.util.TestUtil;

public class UlogoAllassignmentsPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoAllassignmentsPage uLogoAllassignmentsPage;
	TestUtil testUtil;
	
	public UlogoAllassignmentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		loginPage=new LoginPage();
		uLogoAllassignmentsPage=new UlogoAllassignmentsPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEleven();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickAllassignmentsTab();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
		
	}
	
	@Test
	public void UlogoAllassignmentsPage()throws Exception {
		uLogoAllassignmentsPage.enterSearchCompany("QA EngineerEight");
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickExactSearch();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickExactSearch();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickResetCompany();
		testUtil.testWaitFour();
		uLogoAllassignmentsPage.clickFilterDropDown();
		testUtil.testWaitTwo();
		uLogoAllassignmentsPage.selectFilterDropDown();
		testUtil.testWaitEight();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
