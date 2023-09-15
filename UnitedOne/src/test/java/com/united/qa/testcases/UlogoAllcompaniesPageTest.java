package com.united.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.united.qa.base.TestBase;
import com.united.qa.pages.HomePageAdmin;
import com.united.qa.pages.LoginPage;
import com.united.qa.pages.UlogoAllcompaniesPage;
import com.united.qa.util.TestUtil;

public class UlogoAllcompaniesPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	UlogoAllcompaniesPage uLogoAllcompaniesPage;
	TestUtil testUtil;
	
	public UlogoAllcompaniesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception{
		initialization();
		loginPage=new LoginPage();
		uLogoAllcompaniesPage=new UlogoAllcompaniesPage();
		testUtil=new TestUtil();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitEight();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickAllCompaniesTab();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		
						
	}
	
	@Test
	public void UlogoAllcompaniesPage()throws Exception {
		//Company verified
		uLogoAllcompaniesPage.clickVerifiedCompanyDropDown();
		testUtil.testWaitTwo();
		uLogoAllcompaniesPage.selectVerifiedCompany();
		testUtil.testWaitEight();		
		uLogoAllcompaniesPage.selectNotVerifiedCompany();
		testUtil.testWaitEight();	
		uLogoAllcompaniesPage.selectAllCompany();
		testUtil.testWaitEight();
		uLogoAllcompaniesPage.clickVerifiedCompanyDropDown();
		testUtil.testWaitFour();
		//Search Deleted company
		uLogoAllcompaniesPage.clickSearchDeletedCompany();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickSearchDeletedCompany();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.enterValueCompanyFilter("Silver");
		testUtil.testWaitFour();
		//Exact match
		uLogoAllcompaniesPage.clickExactMatch();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickExactMatch();
		testUtil.testWaitFour();
		uLogoAllcompaniesPage.clickResetCompanyFilter();
		testUtil.testWaitFour();
		testUtil.scrollUp();
		testUtil.testWaitTwo();
		
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
