package com.united.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.united.qa.base.TestBase;
import com.united.qa.pages.HomePageAdmin;
import com.united.qa.pages.LoginPage;
import com.united.qa.pages.UlogoMycompanyPage;
import com.united.qa.util.TestUtil;

public class UlogoMycompanyPageTest extends TestBase{
	LoginPage loginPage;
	HomePageAdmin homePageAdmin;
	TestUtil testUtil;
	UlogoMycompanyPage uLogoMycompanyPage;
	
	public UlogoMycompanyPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()throws Exception {
		initialization();
		loginPage=new LoginPage();
		testUtil=new TestUtil();
		uLogoMycompanyPage=new UlogoMycompanyPage();
		homePageAdmin=loginPage.loginHomePageAdmin(prop.getProperty("usernametwo"), prop.getProperty("passwordtwo"));
		testUtil.testWaitFourteen();
		homePageAdmin.clickAcceptAllCookies();
		testUtil.testWaitEight();
		homePageAdmin.clickUserLogo();
		testUtil.testWaitFour();
		homePageAdmin.clickMyCompanyTab();
		testUtil.testWaitFour();
		homePageAdmin.moveHoverTologoImage();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		
	}
	
	@Test
	public void uLogoMycompanyPage()throws Exception {
		uLogoMycompanyPage.clickAddNewCompany();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.enterCompanyName("Coffeeshop Checkpoint");
		testUtil.testWaitFour();
		uLogoMycompanyPage.clickCompanyNameTooltip();
		testUtil.testWaitFour();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.clickSectorDropDown();
		testUtil.testWaitFour();
		uLogoMycompanyPage.selectSector();
		testUtil.testWaitFour();
		uLogoMycompanyPage.clearWebsiteField();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.enterWebsiteUrl("https://coffeshopcheckpoint.com");
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		testUtil.scrollDown();
		testUtil.testWaitTwo();
		uLogoMycompanyPage.clickSaveBtn();
		testUtil.testWaitFour();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
