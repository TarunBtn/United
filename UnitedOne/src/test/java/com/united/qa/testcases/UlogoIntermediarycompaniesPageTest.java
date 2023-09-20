package com.united.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.united.qa.base.TestBase;
import com.united.qa.pages.HomePageAdmin;
import com.united.qa.pages.LoginPage;
import com.united.qa.pages.UlogoAllcompaniesPage;
import com.united.qa.pages.UlogoIntermediarycompaniesPage;
import com.united.qa.util.TestUtil;

public class UlogoIntermediarycompaniesPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoAllcompaniesPage uLogoAllcompaniesPage;
	UlogoIntermediarycompaniesPage uLogoIntermediarycompanyPage;
	TestUtil testUtil;
	
	public UlogoIntermediarycompaniesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		loginPage=new LoginPage();
		uLogoAllcompaniesPage=new UlogoAllcompaniesPage();
		uLogoIntermediarycompanyPage=new UlogoIntermediarycompaniesPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEleven();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitTwo();
		homePageAdmin.clickIntermediaryCompanyTab();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		
	}
	
	@Test
	public void UlogoIntermediarycompanyPage()throws Exception {
		uLogoIntermediarycompanyPage.enterSearchCompany("SilverTouch");
		testUtil.testWaitFour();
		//uLogoIntermediarycompanyPage.clickSearchCompany();
		//testUtil.testWaitTwo();
		//uLogoIntermediarycompanyPage.clickCancelSearch();
		//testUtil.testWaitTwo();
		uLogoIntermediarycompanyPage.clickAddNewCompany();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.enterCompanyName("SilverTouch");
		testUtil.testWaitEight();
		uLogoAllcompaniesPage.selectCompanyTooltip();
		testUtil.testWaitFour();
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
